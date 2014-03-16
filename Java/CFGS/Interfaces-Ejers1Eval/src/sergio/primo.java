package sergio;

import java.io.*;

public class primo {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Dame numero");
		n=Integer.parseInt(teclado.readLine());
		while (n!=0) {
			if (esPrimo(n)==true) {
				System.out.println("Es primo");
			}else{
				System.out.println("No es primo");
			}
			System.out.println("Dame numero");
			n=Integer.parseInt(teclado.readLine());
		}

	}
	private static boolean esPrimo(int n) {
		int i;
		for (i = 2; i < n; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
