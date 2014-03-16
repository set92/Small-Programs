package ficheros;

import java.io.File;

//Porgrama que muestre la lista de directorios raiz del ordenador
public class MostrarDirectorios {

	public static void main(String[] args) {
		File [] lista=File.listRoots();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]+" ");
		}
	}

}
