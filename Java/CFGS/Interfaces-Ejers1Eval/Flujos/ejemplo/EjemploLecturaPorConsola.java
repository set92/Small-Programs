package ejemplo;

/*Otro ejercicio de manejo de flujos de la p�gina 153 del libro de RAMA
Utilizaremos las clases "InputStreamReader" y "BufferedReader"
Al crear un objeto de la clase "BufferedReader" (br) el constructor de esta clase pide un 
Flujo de caracteres (un reader) por  lo que utilizamos un objeto "InputStreamReader" que a su
vez pide en su constructor un "InputStream" (el objeto "System.in")*/

import java.io.*;

public class EjemploLecturaPorConsola {

	public static String leercadena(){
		String cad="";
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		try{
			cad = br.readLine();
		}catch (IOException e ) {
			e.printStackTrace();
		}
		return cad;
	}

	public static void main(String args[]) throws IOException {
		String cad;
		System.out.println("Este programa hace eco hasta que escribas \"para\" :");
		do {
			cad = leercadena();
			System.out.println(cad);
		} while(!cad.equals("para"));
		System.out.println("¡Perfecto!, se acabo la serie.");
	}
}

