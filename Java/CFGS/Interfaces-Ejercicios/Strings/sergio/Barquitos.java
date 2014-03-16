package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Barquitos {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String[][] campo_batalla = new String[6][20];
		String jugador1 = null, jugador2 = null;
		String[] jugadores = new String[2];
		
//		Creamos el campo de batalla
		for (int i = 0; i < campo_batalla.length; i++) {
			for (int j = 0; j < campo_batalla[i].length; j++) {
				campo_batalla[i][j]=Integer.toString(0);
			}
		}
		
//		Metodo para elegir nombre y mas tarde implementar empiece automatico
		jugadores=menu_usuario(jugador1,jugador2);
		
		System.out.println("Bienvenido "+jugadores[0]);
		System.out.println("Bienvenido "+jugadores[1]);
		System.out.println("Este es vuestro campo de batalla\r");
		
//		Visualizamos el campo de batalla
		for (int i = 0; i < campo_batalla.length; i++) {
			for (int j = 0; j < campo_batalla[i].length; j++) {
				System.out.print(campo_batalla[i][j]);
			}
			System.out.println();
		}
		System.out.println(jugadores[0]+" sus piezas son: \r");
		System.out.println("1 Portaaviones(5), 2 Acorazados(4), 2 Crucero(3) y 3 Txalupas(2)");
		
		
		
	}

	private static String[] menu_usuario(String jugador1, String jugador2) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
//		Creamos un array para poder devolver los 2 nombre introducidor por los jugadores
		String[] array = new String[2];

		System.out.println("Nombre del Jugador 1: ");
		jugador1=lectura.readLine();
//		Asignamos el nombre del jugador a la primera posicion del array
		array[0] = jugador1;
		System.out.println("Nombre del Jugador 2: ");
		jugador2=lectura.readLine();
		array[1]=jugador2;
		
		return array;
	}


}
