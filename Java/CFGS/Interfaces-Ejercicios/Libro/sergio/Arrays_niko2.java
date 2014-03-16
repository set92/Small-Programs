package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Arrays 2
//Realiza un programa que declare un array llamado ALTURAS de 100pos. Solicitar al usuario cuantos animales hay en el zoo, guardar todas sus alturas.
//Calcular el mas alto, el mas bajo y la media.
//Autor: Sergio Tobal
//Fecha: 17-04-2012
public class Arrays_niko2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=3;
		int ALTURAS[]=new int[SLOTS];
		int altura_usuario,cont=1,max_alto=0,min_alto=200,media=0;
		
		for (int i = 0; i < ALTURAS.length; i++) {
			System.out.println("Dame altura nº"+cont+": ");
			ALTURAS[i]=Integer.parseInt(lectura.readLine());
			cont++;
		}
		
//		Se comprueba la mayor altura, la menor y se hace la media
		for (int i = 0; i < ALTURAS.length; i++) {
			if (ALTURAS[i]>max_alto) {
				max_alto=ALTURAS[i];
			}
			if (ALTURAS[i]<min_alto) {
				min_alto=ALTURAS[i];
			}
			media=media+ALTURAS[i];
		}
		
//		Se divide entre el numero de huecos en el array
		media=media/SLOTS;
		
//		Se visualizan los resultados
		System.out.println("El valor mas alto es: "+max_alto);
		System.out.println("El menor valor es: "+min_alto);
		System.out.println("La media es: "+media);
	}

}
