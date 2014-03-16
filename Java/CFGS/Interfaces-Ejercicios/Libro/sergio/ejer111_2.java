package sergio;
//Ejercicio 2 - Pag 111
//Realiza un programa con un metodo recursivo que muestre por pantalla la serie de fibonacci. 
//Autor: Sergio Tobal
//Fecha: 19-03-2012
public class ejer111_2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i)+",");
		}
	}

	private static int fibonacci(int num) {
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		return fibonacci(num-1)+fibonacci(num-2);
	}
	

}
