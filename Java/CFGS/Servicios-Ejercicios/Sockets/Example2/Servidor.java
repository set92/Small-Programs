package Example2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	static final int PUERTO=5000;
	
	public Servidor(){
		try {
//			No se cierra el socket del servidor en ningun momento porque como no es un bucle infinito
//			no es necesario pues se cerrara solo en algun momento, en este caso al entrar 3 clientes
			@SuppressWarnings("resource")
			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Escucho el puerto "+ PUERTO);
			for (int numClient = 0; numClient < 3; numClient++) {
				Socket skCliente = skServidor.accept();
				System.out.println("Sirvo al cliente "+(numClient+1));
				OutputStream flujoSalida = skCliente.getOutputStream();
				DataOutputStream flujoSalidaDatos = new DataOutputStream(flujoSalida);
				flujoSalidaDatos.writeUTF("Hola cliente "+(numClient+1));
				flujoSalidaDatos.close();
				skCliente.close();
			}
			System.out.println("Demasiados clientes por hoy");
//			skServidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	public static void main(String[] args) {
		new Servidor();
	}
	


}
