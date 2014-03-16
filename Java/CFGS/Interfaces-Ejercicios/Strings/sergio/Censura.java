package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Strings 4
//Realiza un metodo llamado censura que comprueba si un texto contiene
//una subcadena tabu y ser asi tiene 3 opciones: si es tipo 1 devuelve el texto
//sin la cadena tabu, si es 2 devuelve el texto con los caracteres correspondientes
//a la cadena tabu sustituidos por astericos, si es 3 no hace nada
//Autor: Sergio Tobal
//Fecha: 11-05-2012
public class Censura {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String tabu="tabu";
		String texto,texto_devuelto="";
		
//		Pedimos texto al usuario
		System.out.println("Introduce un texto");
		texto=lectura.readLine();

//		Llamamos al metodo que comprobara si contiene la subcadena
		texto_devuelto=censura(texto, tabu);
		
//		Si se nos devuelve null, es decir nada desde el metodo entonces saldra del programa
		if (texto_devuelto==null) {
			System.exit(0);
		}
		
//		Mostramos el valor de lo conseguido en el metodo
		System.out.println(texto_devuelto);
	}

	private static String censura(String texto, String tabu) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int cont=0,tipo=0;
		String texto1="";
		String texto_MOD=texto;
		
//		Creamos un bucle en el que se mirara cuantas palabras tabu hay, si encuentra una creara
//		un substring para poder saber si hay mas de una palabra tabu, recorriendo el String hasta
//		que sea -1, es decir final de String, al final tendras un contador con el numero de palabras
//		tabu que hay en el String
		while (texto_MOD.indexOf(tabu) > -1) {
//			Suma el sitio donde se ha encontrado la palabra tabu mas su largura, para asi poder continuar
//			a partir de ahi hacia delante, y sigue hasta el final de la largura del texto
		     texto_MOD = texto_MOD.substring ( texto_MOD.indexOf(tabu) + tabu.length() ,  texto_MOD.length());
		     cont++;
		}
		
//		Si el contador es igual a 0 quiere decir que no hay ningun tabu por lo cual sale automaticamente
		if (cont==0) {
			System.out.println("No hay ninguna palabra tabu. ADIOS.");
		}
//		Si hay algun tabu dentro de la pantalla preguntamos el tipo que es, si es 1 reemplazamos tabu por nada
//		y si es tipo 2 reemplazamos tabu por asteriscos
		else if (cont>-1) {
			System.out.println("Que tipo es usted?");
			tipo=Integer.parseInt(lectura.readLine());
			
			if (tipo==1) {
				texto1=texto.replace("tabu","");
				return texto1;
			}else if (tipo==2) {
				texto1=texto.replace("tabu", "****");
				return texto1;
			}
		}
		return null;
	}

}
