package ejemplo;

// Ejemplo de uso dela clase PushbackReader (p�g. 155 RAMA) que permite devolver un caracter leido al flujo
// de entrada del que ven�a.

/* En este ejercicio, dada una cadena de caracteres vamos a sustituir los operadores incrementales (del tipo "b++")
 * por su expresi�n equivalente (del tipo "b=b+1"). Suponemos que las variables s�lo tienen una letra
 * Para ello siempre vamos a tener dos elementos de la cadena (el "�ltimo" y el "pen�ltimo"), pero hay que tener en
 * cuenta que cada vez que hacemos una lectura ("pbr.read()") el "puntero" del flujo avanza una posici�n. Si queremos
 * "volver" a leer un caracter (cuando despu�s de un "+" viene otro caracter que no es otro "+") necesitamos hacer un 
 * "pbr.unread(ultimo)". En el fondo es como si retras�ramos una posici�n el puntero del lector del flujo. */

import java.io.*;
	
public class EjemploPushbackReader {
	
	public static void main(String args[]) throws IOException {
		String sentencias = "a=a+1;c++;b+=5;c=a+b;b++;";
		StringReader sr = new StringReader(sentencias);
		PushbackReader pbr = new PushbackReader(sr);
		int ultimo=pbr.read(),penultimo=0;
		
		while (ultimo != -1) {
			switch(ultimo) {
				case '+':
					if ((ultimo = pbr.read()) == '+'){
						System.out.print("="+(char) penultimo+"+1");
					}else{
						pbr.unread(ultimo); //Devolvemos el �ltimo caracter leido al flujo (buffer) de entrada
						System.out.print('+');
					}
					break;
				case ';':
					System.out.println((char)ultimo);
					break;
				default:
				System.out.print((char) ultimo);
			}
			penultimo=ultimo;
			ultimo = pbr.read();
		}
	}
}

