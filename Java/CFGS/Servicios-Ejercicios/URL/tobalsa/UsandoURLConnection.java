package tobalsa;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UsandoURLConnection {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.google.es:80/");
			URLConnection conexion = url.openConnection();
			conexion.connect();
			
			System.out.println(conexion.getContentType());
			
			System.out.println("protocolo = "+url.getProtocol());
			System.out.println("ordenador = "+url.getHost());
			System.out.println("fichero = "+url.getFile());
			System.out.println("puerto = "+url.getPort());
			System.out.println("ref = "+url.getRef());
			System.out.println("fecha modificacion = "+new Date(conexion.getLastModified()));
			System.out.println("fecha = "+new Date(conexion.getDate()));
			System.out.println("Tamaño = "+conexion.getContentLength());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
