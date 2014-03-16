package ficheros;

import java.io.File;

//Programa que muestre la lista de ficheros de un directorio
public class FicherosDirectorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:/");
		String[] ficheros=null;
		ficheros= file.list();
		for (int i = 0; i < ficheros.length; i++) {
			System.out.println(ficheros[i]);
		}
		
		
		
	}

}
