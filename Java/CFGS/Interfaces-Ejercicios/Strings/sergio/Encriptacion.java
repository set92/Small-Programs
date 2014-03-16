package sergio;
//Ejercicio Strings 3
//Realizar un metodo llamado encriptar cuya mision sera encriptar la palabra recibida.
//El proceso de encriptar sera sumar 3 valores a cada letra. Devolver dicho resultado.
//Autor: Sergio Tobal
//Fecha: 11-05-2012
public class Encriptacion {
	
	public static void main(String[] args) {
		String texto="JAVI ERA GUAPO";
		char palabra = 0;
		
//		Visualizar texto introducido por el usuario
		for (int i = 0; i < texto.length(); i++) {
			palabra=texto.toUpperCase().charAt(i);
			palabra=palabra;
			System.out.print(palabra);
		}
		System.out.println("\n");
		
//		Llamamos al metodo encriptar que le sumara 3 y visualizara el resultado para luego continuar
//		mostrando otra vez la palabra real
		encriptar(texto, palabra);
		System.out.println("\n");
		
//		Mostrar otra vez la palabra introducida por el usuario
		for (int i = 0; i < texto.length(); i++) {
			palabra=texto.toUpperCase().charAt(i);
			palabra=(char) (palabra);
			System.out.print(palabra);
		}
	}
	private static char encriptar(String texto, char palabra) {
		for (int i = 0; i < texto.length(); i++) {
			palabra=texto.toUpperCase().charAt(i);
			palabra=(char) (palabra+3);
			System.out.print(palabra);
		}
		return palabra;
	}
}
