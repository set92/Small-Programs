package biblioteca;
//Realizar una clase del nombre LectorTeclado que tenga como atributo un objeto de la clase BufferedReader que permita leer datos en el teclado.
//El constructor de la clase crea el objeto de la clase BufferedReader. La clase tiene los metodos
//leeTexto
//leeEntero
//leeDouble
//leeCaracter
//leeBoolean
//que solician al usuario un dato de su correspondiente tipo, mostrando un mensaje que reciben como argumento.
//Si se produce un error en la conversion de los datos leidos por el teclado, se debe solicitar de nuevo la lectura. Una vez leido si no hay error se retorna el dato leido
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorTeclado {
	BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

	public LectorTeclado() {
		@SuppressWarnings("unused")
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

	}

	public String leeTexto(String mensaje) {
		System.out.println(mensaje+": ");
		try {
			return lectura.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	public int leeEntero(String mensaje){
		boolean error=false;
		int numero=0;

		do {
			try {
				System.out.println(mensaje+": ");
				error=false;
				numero=Integer.parseInt(lectura.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println(e.getMessage());
				error=true;
			}
			System.out.println("Introduce otro numero: ");
		} while (error==true);

		return numero;
	}
	public double leeDouble(String mensaje){
		boolean error=false;
		double numero=0;
		
		do {
			try {
				System.out.println(mensaje+": ");
				error=false;
				numero=Double.parseDouble(lectura.readLine());
			} catch (NumberFormatException | IOException e) {
				error=true;
				System.out.println(e.getMessage());
			}
		} while (error);

		return numero;

	}
	public char leeCaracter(String mensaje) {
		boolean error=false;
		char caracter='0';
		do {
			try {
				System.out.println(mensaje+": ");
				error=false;
				caracter= lectura.readLine().charAt(0);
			} catch (IOException e) {
				error=true;
				System.out.println(e.getMessage());
			}
		} while (error);

		return caracter; 

	}
	public boolean leeBoolean(String mensaje) {
		

		try {
			System.out.println(mensaje+": ");
			if (lectura.readLine().charAt(0)=='S' || lectura.readLine().charAt(0)=='s') {
				return true;
			}
			else {
				return false;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
