package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.println("Dame numero para factorizar: ");
		num=Integer.parseInt(lectura.readLine());
		
		
		System.out.println("\n Su factorial es: "+factorial(num));
		
	}
	
	private static long factorial(int n1) {
		int i;
		long dev=1;
		for(i=1;i<=n1;i++){
			dev=dev*i;
		}
		return(dev);
	}
	
}
