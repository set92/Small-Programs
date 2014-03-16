package chatSockets;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

class Cliente {
	static final String HOST = "localhost";
	static final int PUERTO=5000;

	public Cliente() {
		try{
			Socket skCliente = new Socket(HOST,PUERTO);
			InputStream aux = skCliente.getInputStream();
			DataInputStream flujo = new DataInputStream( aux );
			System.out.println( flujo.readUTF() );
			skCliente.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}

	public static void main( String[] arg ) {
		new Cliente();
	}

}