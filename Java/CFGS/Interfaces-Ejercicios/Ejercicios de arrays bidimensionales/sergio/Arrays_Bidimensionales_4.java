package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 4
//Realizar el juego de “3 en raya”. 
//•	Pintaremos el tablero
//•	Solicitaremos sucesivamente las posiciones a marcar por el jugador de dicho turno 
//			Marcaremos el tablero con la posición dada con ‘X’ o ‘0’ según el jugador. 
//•	Pediremos posiciones hasta un máximo de 9 veces o hasta que la posición sea 0. 
//			Las posiciones válidas están comprendidas entre 1 y 9. 
//•	Ten en cuenta que una coordenada viene indicada por su columna y fila.
//
//Opciones que se pueden programar (no recomendable para aquellos con falta de tiempo): 
//			Un usuario no puede elegir una posición ya marcada. 
//			Controlar si ya se hace línea o no, indicando el jugador ganador.
//Autor: Sergio Tobal
//Fecha: 21-04-2012
public class Arrays_Bidimensionales_4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num=1;
		int[][] ARRAYM = new int[3][3];

//		Inicializacion del array
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            ARRAYM[i][j]=0;
	        }
	    }
		while (num!=99) {
			
//		Visualizar
		visualizar(ARRAYM);
		
//		Solicitar las posiciones 
		posicion(ARRAYM, num);
		
//		Comprobacion de 3 en raya o espacios ocupados.
		salir(ARRAYM);
		}
		
		
		
		
	}
	
//	Recorremos el array y si el no hay ningun espacio en blanco(es decir en 0) o alguien ha hecho 3 en raya termina
	private static void salir(int[][] ARRAYM) {
		int cont_n_espacios=0;
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
//				Comprobamos que si el valor no es 0 se vaya sumando en un contador para mas adelante mirar si no hay ningun espacio libre decir EMPATE
				if (ARRAYM[i][j]!=0) {
					cont_n_espacios++;
				}
//				Comprobamos si se ha hecho linea del jugador 1 
				if (ARRAYM[0][0]==1 && ARRAYM[1][1]==1 && ARRAYM[2][2]==1) {
					System.out.println("GANA JUGADOR 1");
					System.exit(0);
				}
//				Comprobamos si se ha hecho linea del jugador 1 
				if (ARRAYM[0][0]==2 && ARRAYM[1][1]==2 && ARRAYM[2][2]==2) {
					System.out.println("GANA JUGADOR 2");
					System.exit(0);
				}
			}
		}
	}

	private static void posicion(int[][] ARRAYM, int num)throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int row=0,col=0;
		System.out.println("Jugador"+num+": En que fila quiere introducir ficha?");
		row=Integer.parseInt(lectura.readLine());

		System.out.println("Jugador:  Y en que columna?");
		col=Integer.parseInt(lectura.readLine());
		if (col <= 0 || col > 3 || row <= 0 || row > 3) {
			System.out.println("ERROR. SE HA INTRODUCIDO UNA POSICION FUERA DEL CAMPO DE JUEGO");
			System.exit(0);
		}
		
		ARRAYM[row-1][col-1]=1;

		
	}

	private static void visualizar(int[][] ARRAYM) {
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            System.out.print(ARRAYM[i][j]+"\t");
	        }
	        System.out.println("");
	    }
		
	}

}
