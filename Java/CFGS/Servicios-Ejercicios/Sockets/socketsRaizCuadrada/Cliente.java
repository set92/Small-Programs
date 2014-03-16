package socketsRaizCuadrada;

import java.io.*;
import java.net.*;

class Cliente {
	private static final String HOST = "localhost";
	private static final int PUERTO=5000;
	private static double numero = 0;
	
	public static void main(String[] arg) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Buenos dias, espere un momento mientras inicializamos el servidor y el cliente");
			Socket skClient = new Socket(HOST, PUERTO);
			
			Thread.sleep(3000);//Delay mientras se inicializan los sistemas
			System.out.println("Escriba de que numero desea hacer la raiz cuadrada: ");
			numero = Double.parseDouble(lectura.readLine());
			
			System.out.println("Procesando...");
			Thread.sleep(1000);
			OutputStream flujoEnvio = skClient.getOutputStream();//Abrimos flujos de envio
			DataOutputStream flujoEnvioDatos = new DataOutputStream(flujoEnvio);
			flujoEnvioDatos.writeDouble(numero);
			
			InputStream flujoEntrada = skClient.getInputStream();//Abrimos flujos de recibir
			DataInputStream flujoEntradaDatos = new DataInputStream(flujoEntrada);
			System.out.println("La raiz cuadrada de "+numero+" es: "+flujoEntradaDatos.readInt());

//			Cerramos flujos
			skClient.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
