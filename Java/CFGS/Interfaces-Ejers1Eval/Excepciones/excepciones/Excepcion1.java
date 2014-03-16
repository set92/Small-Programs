package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepcion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		boolean error=false;

		do {
			try {
				error=false;
				System.out.println("Introduce un numero 1: ");
				int num1=Integer.parseInt(lectura.readLine());
				System.out.println("Introduce un numero 2: ");
				int num2=Integer.parseInt(lectura.readLine());
				
				System.out.printf("La division %d/%d = %d\n",num1,num2,num1/num2);
				
			} catch (NumberFormatException e){
				System.out.println("Error de NumberFormatException");
				error=true;
			} catch (IOException e){
				System.out.println("Error de IOException");
				error=true;
			} catch (ArithmeticException e){
				System.out.println("Error de tipo ArithmeticException");
				error=true;
			} catch (Exception e) {
				System.out.println("Error de tipo Exception");
				error=true;
			}
		} while (error);

	}

}
