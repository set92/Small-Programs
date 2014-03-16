package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//Programa que muestra los atributos del archivo especificado por el usuario
//(Mostrar el nombre, la ruta, si existe o no, si se puede modificar o no, y la longitud en bytes del fichero)
public class AtributosFichero {

	public static void main(String[] args) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String nombreArchivo = null;

		System.out.println("Introduzca la ruta del archivo: ");
		try {
			nombreArchivo=lectura.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File archivo = new File(nombreArchivo);			
		
		System.out.println("Nombre del archivo: "+archivo.getName());
		System.out.println("Ruta del archivo: "+archivo.getPath());
		if (archivo.exists()) {
			System.out.println("El archivo existe");
		}else {
			System.out.println("El archivo no existe");
		}
		if (archivo.canWrite()) {
			System.out.println("Es modificable");
		}else {
			System.out.println("No es modificable");
		}
		System.out.println("El archivo pesa "+archivo.length()+" bytes");

	}

}
