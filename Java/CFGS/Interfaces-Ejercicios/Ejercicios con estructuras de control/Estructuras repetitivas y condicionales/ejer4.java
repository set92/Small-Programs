//Ejercicio 4
//Realiza un programa que solicite dos numeros al usuario. Tras haber recogido los numeros
//le presentaremos: 1. Sumar, 2.Restar, 3. Multiplicar, 4.Dividir, 5.Acabar Solicitar
//al usuario el numero de la operacion matematica. El programa debe visualizar el resulta
//-do. Se presentara el menu de operaciones hasta que se pulse la opcion acabar.
//Autor: Sergio Tobal
//Fecha: 22-01-2012
import java.io.*;

public class ejer4 {
//	Habilito el teclado aqui para solo declararlo una vez y no una por metodo que use.
private static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int num1, num2;
		
//		Introduccion de numeros que se usaran luego
		System.out.println("Introduzca numero 1: ");
		num1=Integer.parseInt(lectura.readLine());
		System.out.println("Introduzca numero 2: ");
		num2=Integer.parseInt(lectura.readLine());
		
//		Se llama a otros metodos encargados de mostrar el menu y decidir que opcion ejecutara
		menu();
		loop(num1, num2);		
		
	}
	
//	Metodo encargado de dibujar el menu
	private static void menu() {
		System.out.println("---------------> Menu <---------------\n" +
				"1.Sumar\n" +
				"2.Restar\n" +
				"3.Multiplicar\n" +
				"4.Dividir\n" +
				"5.Acabar");	
	}
	
//	Metodo encargado de elegir la opcion
	private static void loop(int num1, int num2)throws IOException, Exception {
		String opcion;
		
		while (true) {
			opcion=lectura.readLine();
//			El equalIgnoreCase comprueba que el valor entre " " es igual al almacenado en op
//			-cion, si es asi, sera true, por lo que al compararlo con true se introduce
//			dentro de la condicional. Esta funcion tambien ignora si el valor esta en minus
//			o en mayusculas.
			if (opcion.equalsIgnoreCase("1") == true) {
//				Llama al metodo suma y le pasa las variables num1 y num2 que son las que el 
//				usuario a tecleado al principio del programa
				suma(num1, num2);
			}else if (opcion.equalsIgnoreCase("2") == true) {
				resta(num1, num2);
			}else if (opcion.equalsIgnoreCase("3") == true) {
				multiplicar(num1, num2);
			}else if (opcion.equalsIgnoreCase("4") == true) {
				dividir(num1, num2);
			}else if (opcion.equalsIgnoreCase("5") == true) {
				break;
			}else {
				System.out.println("Numero no reconocido. Introduzca otro numero");
			}
		}
	}

//	Metodo encargado de sumar, todos el resto de los metodos son igual que este, solo cambia
//	la operacion que hacen, uno suma, otro resta, otro divide y otro multiplica.
	private static void suma(int num1, int num2) throws IOException {
		int resultado;
		
		resultado=num1+num2;
		System.out.println("La suma de "+num1+" + "+num2+" es: "+resultado);
		
//		Funcion que se usa para que no vaya al menu hasta que no haya pulsado la tecla Enter
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
		menu();
	}

	private static void resta(int num1, int num2) throws IOException {
		int resultado;
		
		resultado=num1-num2;
		System.out.println("La resta de "+num1+" - "+num2+" es: "+resultado);
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
		menu();
	}

	private static void multiplicar (int num1, int num2)throws IOException {
		int resultado;
		
		resultado=num1*num2;
		System.out.println("La multiplicacion de "+num1+" * "+num2+" es: "+resultado);
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
		menu();
	}

	private static void dividir(int num1, int num2)throws IOException {
		int resultado;
		
		resultado=num1/num2;
		System.out.println("La division de "+num1+" / "+num2+" es: "+resultado);
		
		System.out.print("Pulsa Enter para continuar");
		System.in.read();
		menu();
	}


}
