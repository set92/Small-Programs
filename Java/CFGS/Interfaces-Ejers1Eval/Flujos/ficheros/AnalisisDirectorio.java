package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//Realizar un programa que:
//	- Solicite al usuario el nombre de un directorio
//	- Muestre por pantalla los nombres de los ficheros que hay en el directorio
//	solicitado y en todos los subdirectorios que cuelgan de el. (metodo recursivo)
public class AnalisisDirectorio {

	public static void main(String[] args) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		File directorio;
		
		System.out.println("Nombre del directorio: ");
		try {
			directorio=new File(lectura.readLine());
			listarDirectorios(directorio);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void listarDirectorios(File directorio) {
		File [] lista = directorio.listFiles();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
			if (lista[i].isDirectory()) {
				listarDirectorios(lista[i]);
			}
		}
		
		
	}

}
