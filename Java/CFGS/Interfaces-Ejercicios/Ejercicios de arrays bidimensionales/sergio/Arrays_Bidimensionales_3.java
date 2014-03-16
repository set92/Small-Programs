package sergio;
//Ejercicio 3
//Realizar un programa que cree un array bidimensional de 5*6.
//Se le cargará con el valor de fila a la que pertenece. Visualiza  el contenido.
//Autor: Sergio Tobal
//Fecha: 21-04-2012
public class Arrays_Bidimensionales_3 {
	
	public static void main(String[] args) {
		int[][] ARRAYM = new int[5][6];
		
//		Asignar el valor de la fila a toda la fila
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
				ARRAYM[i][i]=(i+1);
			}
		}
		
//		Visualizar
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            System.out.print(ARRAYM[i][j]+"\t");
	        }
	        System.out.println("");
	    }
		
	}

}
