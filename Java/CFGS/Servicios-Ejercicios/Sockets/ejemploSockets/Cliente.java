package ejemploSockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Cliente {
	static final String HOST="localhost";
	static final int PUERTO=5000;
	
	public Cliente() {
		try {
			Socket skCliente= new Socket(HOST, PUERTO);
			InputStream FlujoEntrada = skCliente.getInputStream();
			DataInputStream FlujoEntradaDatos = new DataInputStream(FlujoEntrada);
			System.out.println(FlujoEntradaDatos.readUTF());
			
			FlujoEntradaDatos.close();
			skCliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Cliente();
	}

}
