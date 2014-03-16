package sergio;
/*
 * Ejercicio 1 - Pag 77
 * Realiza un programa utilizando bucles que muestre la siguiente figura:
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 * Autor: Sergio Tobal
 * Fecha: 00-00-2012
 */
public class ejer773 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,ancho,naste,nespacios;
		ancho=8;
		naste=1;
		nespacios=ancho/2-naste;
		int filas;
		int sentido;
		sentido=1;
		
		for(filas=0; filas<ancho-1;filas++){
			// pinto espacios
			for (i=0; i<nespacios;i++){
				System.out.print(" ");
			}
			// pinto asteriscos
			for (i=0; i<naste;i++){
				System.out.print("*");
			}
			System.out.print("\n");
			if (sentido==1){
				naste+=2;
				nespacios--;
			}else{
				naste-=2;
				nespacios++;
			}
			
			if (nespacios==0){
					sentido=2;
			}
			
				
		}
			
	}

}
