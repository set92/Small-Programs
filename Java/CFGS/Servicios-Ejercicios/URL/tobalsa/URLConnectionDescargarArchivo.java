package tobalsa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDescargarArchivo {
	
	public static void main(String[] args) {
		try {
			URL u = new URL("http://www.mcgraw-hill.es/imagenes/general/mhe_logo.gif");
			URLConnection uc = u.openConnection();
			String ct = uc.getContentType();
			int cl = uc.getContentLength();
			
			if (ct.startsWith("text/") || cl == -1) {
				System.out.println("ERROR:  ESTA URL es de tipo texto");
				return;
			}
			InputStream is = uc.getInputStream();
			BufferedInputStream in = new BufferedInputStream(is);
			
			String fich = u.getFile();
			fich = fich.substring(fich.lastIndexOf('/')+1);
			
			FileOutputStream fout = new FileOutputStream(fich);
			BufferedOutputStream out = new BufferedOutputStream(fout);
			
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
				System.out.println(i);
			}
			
			out.flush();
			in.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		
	}
}
