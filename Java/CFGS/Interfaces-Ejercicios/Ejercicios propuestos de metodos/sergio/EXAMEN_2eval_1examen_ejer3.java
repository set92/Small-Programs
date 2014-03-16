package sergio;

import java.io.*;

//Ejercicio 3
//Realiza un programa que solicite dos numeros al usuario. Tras haber recogido los numeros
//le presentaremos: 1. Sumar, 2.Restar, 3. Multiplicar, 4.Dividir, 5.Acabar Solicitar
//al usuario el numero de la operacion matematica. El programa debe visualizar el resulta
//-do. Se presentara el menu de operaciones hasta que se pulse la opcion acabar.
//Autor: Sergio Tobal

public class EXAMEN_2eval_1examen_ejer3 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		char opcion;
		
		
		do {
				
		System.out.println("A. Suma" +
				"\nB. Resta" +
				"\nC. Multiplicar" +
				"\nD. Dividir" +
				"\nF.Salir");
		
		System.out.print("Buenos dias usuario, esto es una calculadore, por favor introduzca el primer numero a usar: ");
		num1=Integer.parseInt(lectura.readLine());
		
		System.out.print("Gracias por introducir el numero "+num1+", ahora introduzca el segundo numero");
		num2=Integer.parseInt(lectura.readLine());
		
		System.out.println("Gracias usuario por introducir el numero "+num1+" y el numero "+num2);
		
		System.out.println("Ahora por favor pulse la tecla de la opcion que desea realizar");
		opcion=lectura.readLine().charAt(0);
		
		switch (opcion) {
		case 'A':System.out.println("Opcion introducida: Sumar");suma(num1, num2);break;
		case 'B':System.out.println("Opcion introducida: Resta");resta(num1, num2);break;
		case 'C':System.out.println("Opcion introducida: Multiplicacion");multiplicacion( num1, num2);break;
		case 'D':System.out.println("Opcion introducida: Division");division(num1, num2);break;

		case 'F':System.out.println("Opcion introducida: Salir");System.exit(0);break;
		
		default:System.out.println("¡¡¡ERROR INUTIL!!!  Introduccion incorrecta");break;
		}
		
		
		} while (true);
		
	}

	private static void division(int num1,int num2) throws IOException {
		System.out.println("La division entre "+num1+" y "+num2+" es "+(num1/num2));
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
	}

	private static void multiplicacion(int num1,int num2) throws IOException {
		System.out.println("La multiplicacion entre "+num1+" y "+num2+" es "+(num1*num2));
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
	}

	private static void resta(int num1,int num2) throws IOException {
		System.out.println("La resta entre "+num1+" y "+num2+" es "+(num1-num2));
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
	}

	private static void suma(int num1, int num2) throws IOException {
		System.out.println("La suma entre "+num1+" y "+num2+" es "+(num1+num2));
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
	}

}
