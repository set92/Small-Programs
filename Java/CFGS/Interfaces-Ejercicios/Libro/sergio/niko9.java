package sergio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio niko9
//Realiza un metodo inverso que calcule el valor invertido del numero introducido
//Autor: Sergio Tobal
//Fecha: 16-01-2012
public class niko9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int numero=52, r;
		
		System.out.println("Introduce numero: ");
		numero=Integer.parseInt(lectura.readLine());
		r=inverso(numero);
		System.out.println("Su numero invertido es"+r);
	}
	
	public static int inverso(int numero) {
		int inverso=0, ultimo;
		while (numero>0) {
			ultimo=numero%10;
			numero=numero/10;
			inverso=inverso*10+ultimo;
		}
		return inverso;
	}

}
