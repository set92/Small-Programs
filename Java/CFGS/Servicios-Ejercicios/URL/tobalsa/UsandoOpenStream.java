package tobalsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UsandoOpenStream {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.google.es:80/");
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
			String linea;
			
			while ((linea = bf.readLine()) != null) {
				System.out.println(linea);
			}
			
			bf.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
