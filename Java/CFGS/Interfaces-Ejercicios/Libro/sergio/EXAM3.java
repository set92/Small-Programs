package sergio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Inicializacion de las librerias necesarias para introduccion por teclado

public class EXAM3 {//Creacion de la clase que contendra el codigo

	public static void main(String[] args)throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));//Habilitar teclado
		int numero, inverso=0, ultimo;
		
		System.out.println("Dame fecha toda seguida(8 digitos): ");
		System.out.println("Ejemplo: 18012012");
		numero=Integer.parseInt(lectura.readLine());
		while (numero>0) {//Bucle que va cortando los numeros para ver si son inversos
			ultimo=numero%10;
			numero=numero/10;
			inverso=inverso*10+ultimo;
		}
		System.out.println(inverso);
		
	}

}
