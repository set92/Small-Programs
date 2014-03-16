package sergio;
//Ejercicio 1
//Realizar un programa que cree un array bidimensional de 3*4. Inicializarlo 0.
//Inicializarlo posteriormente con la sucesión de números del 1 al 12. 
//Realiza el proceso para sumar los valores del array y visualizar el resultado. 
//Autor: Sergio Tobal
//Fecha: 21-04-2012
public class Arrays_Bidimensionales_1 {
//	System.out.println(ARRAYM.length);  ------- Esto nos da el numero de filas
//	System.out.println(ARRAYM[0].length); -----Esto nos da el numero de columnas, en este caso de la fila 0
//	int[][] matriz={{1,2,3,4,10,2,34},{5,6,20,34,3,2,12},{7,10,9,10,11,12},{13}};
	public static void main(String[] args) {
		int[][] ARRAYM=new int[3][4];
		int cont=1,suma=0;
		
//		Inicializacion del array a 0
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[0].length; j++) {
				ARRAYM[i][j]=0;
			}
		}
		
//		Inicializacion del array del 1 al 12
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[0].length; j++) {
				ARRAYM[i][j]=cont;
				cont++;
			}
		}
		
//		Visualizamos los valores del array multidimensional
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            System.out.print(ARRAYM[i][j]+"\t");
	        }
	        System.out.println("");
	    }
		
//		Sumamos los valores y mostramos el resultado
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
				suma=suma+ARRAYM[i][j];
			}
		}
		System.out.println("La suma total es: "+suma);
	}

}
