package sergio;
//Ejercicio 4 - Pag 77
//Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla:
//        *
//      *   *
//     *     *
//    *       *
//     *     *
//      *   *
//        *
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class ejer774 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,altura,ancho=7,naste=1,nespacios=0,sentido=1,linea=1;
		nespacios=ancho/2;
		
		for(altura=0; altura<ancho;altura++){
			//pinto espacios exteriores
			for (i=6; i>nespacios;i--){
				System.out.print("-");
			}
			//pinto asterisco izquierdo
				System.out.print("*");
				
			// pinto espacios interiores
			for (j=2; j<naste;j++){
				System.out.print("+");
			}
			
			//pinto asterisco derecho con if para ver si es primera linea y si es asi solo dibujar un * en vez de 2 *
			if (linea==1 || altura==6) {
			}
			else if (linea==2){System.out.print("*");
			}
				
			//salto de linea
			System.out.print("\n");
			linea=2;
			
			if (altura==3){
				sentido=2;
			}
			
			if (sentido==1){
				naste+=2;
				nespacios++;
			}else if(sentido==2){
				naste-=2;
				nespacios--;
			}
			

		}

	}

}
