package com.tobalsa.sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;

public class HiloServer extends Thread{

	final static int PUERTO = 5000;
	Handler miHandler; // Handler para mandar los mensajes al hilo UI 
	Context mContexto;	// Contexto de la app (para conseguir la ip)
	DatagramSocket serverSocket; // Socket que sirve para mandar y recibir  
	boolean socketOK=true; // Sera verdad siempre que no haya errores de sockets
	InetAddress miBroadcastIP; // Broadcast -> modo de transmision de un nodo a varios nodos simultaneamente
	InetAddress miIP;

	public HiloServer(Context ContextoActual, Handler handler){
		mContexto = ContextoActual;
		miHandler = handler;

		try{ // Abrimos un socket UDP que recibira los mensajes
			serverSocket = new DatagramSocket(PUERTO);
			serverSocket.setBroadcast(true);
		} catch(Exception e){
			e.printStackTrace();
			socketOK = false;
			return;
		}
		try {
			getMyWiFiBroadcastAndIP();
			Log.i("Info","Mi IP: "+miIP);
			Log.i("Info","Mi IP del Broadcast: "+miBroadcastIP);
		} catch (UnknownHostException e) {
			Log.e("ERROR","No se puede conseguir la IP del BroadCast");
			e.printStackTrace();
		}
	}

	@Override
	public void run(){
		byte[] datosRecibidos = new byte[1024]; 

		while(socketOK) { 
			DatagramPacket paquetesRecibidos = new DatagramPacket(datosRecibidos, datosRecibidos.length); 
			try{
				serverSocket.receive(paquetesRecibidos); 
		
		        InetAddress sourceIP = paquetesRecibidos.getAddress();
		        Log.d("Debug","Source IP Address: "+sourceIP);
		        
		        if(!sourceIP.equals(miIP)){
		        	String sentence = new String(paquetesRecibidos.getData(),0,paquetesRecibidos.getLength()); 
		        	miHandler.obtainMessage(MainActivity.PAQUETE_RECIBIDO,sentence).sendToTarget();    
		        	Log.i("Info","Frase recibida: "+sentence);
		        }
			} catch (Exception e){
				e.printStackTrace();
				socketOK = false;
			}
		}
	}

	private void getMyWiFiBroadcastAndIP() throws UnknownHostException{
		WifiManager mWifi = (WifiManager) (mContexto.getSystemService(Context.WIFI_SERVICE));
		
		// DhcpInfo  es un objeto para recuperar los resultados de una llamada DHCP
		DhcpInfo dhcp = mWifi.getDhcpInfo(); 
		int myIntegerIPAddress = dhcp.ipAddress;

		byte[] byteArrays = new byte[4]; 
		for (int i = 0; i < 4; i++) {
			byteArrays[i] = (byte) ((myIntegerIPAddress>> i * 8) & 0xFF);
		}
		miIP = InetAddress.getByAddress(byteArrays);
		
		int miIntBroadcast = (dhcp.ipAddress & dhcp.netmask) | ~dhcp.netmask; 
		for (int i = 0; i < 4; i++) {
			byteArrays[i] = (byte) ((miIntBroadcast >> i * 8) & 0xFF);
		}

		// Devuelve el InetAddress correspondiente al array de bytes. 
		miBroadcastIP=InetAddress.getByAddress(byteArrays); 

	}

	// Manda un paquete UDP a la direccion del broadcast para que este difunda el mensaje
	public void mandarMensaje(String msg) throws IOException {
		byte[] infoEnviada  = new byte[1024]; 
		infoEnviada = msg.getBytes(); 
		DatagramPacket paquetesEnviados = new DatagramPacket(infoEnviada, infoEnviada.length, miBroadcastIP, PUERTO); 
		serverSocket.send(paquetesEnviados);
		Log.i("INFO","Paquete mandado: "+msg);
	}
	
	// Metodo para cerrar el socket antes de salir de la app
	public void cerrarSocket(){
		serverSocket.close();
	}
}
