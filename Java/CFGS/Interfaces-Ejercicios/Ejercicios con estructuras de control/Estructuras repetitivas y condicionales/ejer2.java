//Ejercicio 2
//Realiza un juego que adivine el numero, solicitando al primer jugador el numero que se desee adinivinar. Tras borrar la pantalla se
//solicitara numeros a un segundo jugador hasta que lo adivine. Si el numero es mayor diremos "Se ha pasado", si es menor
//"te has quedado corto". Al final le daremos la enhorabuena.
//Autor: Sergio Tobal
//Fecha: 00-00-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejer2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num, num2=7865;
		
			System.out.println("Dame numero jugador 1: ");
			num=Integer.parseInt(lectura.readLine());
			
//			400 saltos de linea para que desaparezca el numero introducido 
			for (int i = 0; i < 400; i++) {
				System.out.println("");
			}
			
//			Bucle que comprueba el numero introducido por el jugador 2 y hasta que no sea igual que el
//			introducido por el jugador 1 no termina
			while (num2!=num) {
				System.out.println("Dame numero jugador 2: ");
				num2=Integer.parseInt(lectura.readLine());
				if(num2==num){
					System.out.println("Acertastes");
				}else if (num2<num) {
					System.out.println("Te has quedado corto");
				}else if (num2>num) {
					System.out.println("Te has pasado");
				}
			}
//			Este syso es una forma de saber que ha salido del bucle y ha terminado correctamente
			System.out.println("----------------> Fin programa <-------------------");		
	}

}
