package sergio;
//Ejercicio 2
//Realizar un programa que cree un array de 10*10 de nombre TB. 
//Cargar con 0 las filas pares y con 1 las impares. Finalmente visualizarlo.
//Autor: Sergio Tobal
//Fecha: 21-04-2012
public class Arrays_Bidimensionales_2 {
//	System.out.println(ARRAYM.length);  ------- Esto nos da el numero de filas
//	System.out.println(ARRAYM[0].length); -----Esto nos da el numero de columnas, en este caso de la fila 0
	
	public static void main(String[] args) {
		int[][] ARRAYM = new int[10][10];
		
//		Cargar con 0 las filas pares, y con 1 las filas impares
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
//				Ponemos +1 para subsanar que el array empiece en 0, y cuando el usuario cuente empiece en 1 y la fila sea entera 1 por ser impar
				if ((i+1)%2==0) {
					ARRAYM[i][j]=0;
				}else {
					ARRAYM[i][j]=1;
				}
			}
		}
		
//		Visualizar array
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            System.out.print(ARRAYM[i][j]+"\t");
	        }
	        System.out.println("");
	    }
		
	}

}
