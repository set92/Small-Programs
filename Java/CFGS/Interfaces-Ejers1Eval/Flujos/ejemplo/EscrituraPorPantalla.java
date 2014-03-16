package ejemplo;

//Ejercicio de flujos de la p�gina 154 del libro de RAMA
//Utilizamos un objeto de tipo PrintWriter que es redirigido a la pantalla (System.out)
//Tambi�n utilizamos los m�todos "write", "print", "println" y "flush" (vac�a el buffer) de ese objeto.

import java.io.*;

public class EscrituraPorPantalla {
	
	  public static void main(String args[]) throws IOException {
	    PrintWriter pantalla = new PrintWriter(System.out);
	    char[] array = { 'M', 'o', 'r', 'e', 'n', 'o' };
	    String str = new String("Juan Carlos");

	    pantalla.write(str);
	    pantalla.print(" ");
	    pantalla.write(array, 0, 6);

	    pantalla.println("");

	    pantalla.flush();
	  }
}

