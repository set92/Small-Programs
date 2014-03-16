package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 5
//Crear un programa que mediante un menú admita reservar o cancelar asientos de un avión, 
//así como mostrar qué asientos están ocupados y libres actualmente. El array tendrá 25 filas y 4 columnas
//Autor: Sergio Tobal
//Fecha: 20-04-2012
public class Arrays_Bidimensionales_5 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int[][] ARRAYM = new int[25][4];
		int pulsar=0,cont=1;
		
//		Creamos el avion con asteriscos
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
				ARRAYM[i][j]=cont;
				cont++;
			}
		}
		
//		Visualizar
		visualizar(ARRAYM);
		
//		Creamos el menu de reservas que llevara a metodos distintos depende de lo pulsado
		menu_reserva(ARRAYM);
	}

	private static void menu_reserva(int[][] ARRAYM) throws IOException{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int pulsar;
		System.out.println("Que quiere hacer?Pulse 1 para reservar, 2 para cancelar una reserva o 3 para salir del programa");
		pulsar=Integer.parseInt(lectura.readLine());
		if (pulsar==1) {
			reservar(ARRAYM);
		}else if (pulsar==2) {
			cancelar(ARRAYM);
		}else if (pulsar==3) {
			System.exit(0);
		}else {
			System.out.println("Numero pulsado no valido.");
			menu_reserva(ARRAYM);
		}
	}

	private static void visualizar(int[][] ARRAYM) {
		for (int i=0; i < ARRAYM.length; i++) {
	        for (int j=0; j < ARRAYM[i].length; j++) {
	            System.out.print(ARRAYM[i][j]+"\t");
	        }
	        System.out.println("");
	    }
		
	}

	private static void reservar(int[][] ARRAYM) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int row=0,col=0;
		
		System.out.println("Que asiento deseas reservar?");
		System.out.println("Fila: ");
		row=Integer.parseInt(lectura.readLine());
		row=row-1;
		System.out.println("Columna: ");
		col=Integer.parseInt(lectura.readLine());
		col=col-1;
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
				if (i==row) {
					if (j==col) {
						ARRAYM[i][j]=0;
					}
				}
			} 
		}
		visualizar(ARRAYM);
		menu_reserva(ARRAYM);
		
	}
	
	private static void cancelar(int ARRAYM[][]) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int n_reserva=0,row=0,col=0;
		
		System.out.println("La reserva de que fila y columna desea cancelar?");
		System.out.println("Fila: ");
		row=Integer.parseInt(lectura.readLine());
		row=row-1;
		System.out.println("Columna: ");
		col=Integer.parseInt(lectura.readLine());
		col=col-1;
		for (int i = 0; i < ARRAYM.length; i++) {
			for (int j = 0; j < ARRAYM[i].length; j++) {
				if (ARRAYM[i][j]==n_reserva && i==row && j==col) {
					ARRAYM[i][j]=(row*4+col)+1;
				}
			}
		}
		visualizar(ARRAYM);
		menu_reserva(ARRAYM);
	}

}
