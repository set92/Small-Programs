package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Programa que realice las siguientes tareas:
//	- Solicite al usuario el nombre de un fichero
//	- Lea este fichero linea a linea, si la linea leida empieza por el caracter "+",
//	escribe esa linea en un fichero de texto de nombre "Resultado.txt"
//	- Al finalizar la lectura del fichero debe indicar por pantalla el numero de lineas
//	leidas y el numero de lineas escritas
// Usar FileReader y BufferedReader para leer del fichero de entrada y FileOutputStream
// y DataOutputStream para escribir en el fichero de salida.
public class AnalisisFichero {

	
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferEscribir = null;
		File archivoEscrito=new File("c:/Resultado.txt");
		File fichero = null;
		FileReader leerFichero = null;
		FileWriter escribirFile;
		int linesRead=0, linesWrite=0;
		String rutaArchivo=null, contenidoFile="";
		
		System.out.println("Introduzca el nombre del fichero: ");
		try {
			rutaArchivo=lectura.readLine();
			fichero=new File(rutaArchivo);
			leerFichero = new FileReader(fichero);
			//Creamos un buffer para ir leyendo el contenido del archivo
			lectura=new BufferedReader(leerFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (fichero.exists()) {
			escribirFile=new FileWriter(archivoEscrito);
			bufferEscribir = new BufferedWriter(escribirFile);
//			Leemos el contenido del archivo y lo almacenamos en un String todo seguido
			while (lectura.ready()) {
				contenidoFile=lectura.readLine();
				
				if (contenidoFile.charAt(0)=='+') {
//					Escribir en el documento
					bufferEscribir.write(contenidoFile);
					bufferEscribir.newLine();
					linesWrite+=1;
				}
				linesRead+=1;
			}
			bufferEscribir.close();
			lectura.close();
			
			
			//System.out.println(contenidoFile);
			System.out.println("Lineas leidas: "+linesRead);
			System.out.println("Lineas escritas: "+linesWrite);
		}else {
			System.out.println("El fichero no existe o no se encuentra");
		}

		
	}

}
