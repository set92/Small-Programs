package socketsRaizCuadrada;
//Programa que recibe un número del cliente y responde diciendole la raiz cuadrada

import java.io.* ;
import java.net.* ;

class Servidor {
	static final int PUERTO=5000;
	
	public static void main(String[] arg) {
		try {
			System.out.println("Inicializando servidor...");
			ServerSocket skServer = new ServerSocket(PUERTO);
			Socket skClient = skServer.accept();
			
			InputStream flujoEntrada = skClient.getInputStream();//Abrimos los flujos de recojer datos
			DataInputStream flujoEntradaDatos = new DataInputStream(flujoEntrada);
			
			double numero = flujoEntradaDatos.readDouble();
			numero=Math.sqrt(numero); //Realizamos la raiz cuadrada del numero que nos mando el usuario
			
			OutputStream flujoSalida = skClient.getOutputStream();//Creamos flujos de salida
			DataOutputStream flujoSalidaDatos = new DataOutputStream(flujoSalida);
			flujoSalidaDatos.writeDouble(numero);//Devolvemos al usuario el resultado
			
//			Cerramos flujos
			skServer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
