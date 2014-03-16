package sergio;
//El programa solo acepta numeros de hasta 4 digitos
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Inicializacion de las librerias necesarias para introduccion por teclado

public class EXAM1 {//Creacion de la clase que contendra el codigo

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));//Habilitar teclado
		int numero, div=2, contador=0, numero2=0;
		
		System.out.println("Proporcione un numero por favor:");
		numero=Integer.parseInt(lectura.readLine());
		for (int i = 0; i < 100;) {
			//Parte de longitud del numero introducido
			numero2 = numero%10;
			contador=numero2%10;
			contador-=1;
			
			System.out.println("Tiene "+contador+" digitos");
			
			//Parte de calcular primo
			while (numero%div!=0) {
				div++;
			}
			if (div==numero) {
				System.out.println("Es primo");break;//Los break me los obliga a poner para que no este 100 veces comprobando
			}
			else {
				System.out.println("No es primo");break;
			}
		}
	}
}
