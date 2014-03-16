package rmi.print.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;

import rmi.print.common.InterfazSumaResta;

public class ClienteSumaResta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, resSuma, resResta;
		System.setSecurityManager(new RMISecurityManager());
		try {
			InterfazSumaResta printer = (InterfazSumaResta) Naming.lookup("rmi://localhost/printer");
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Pulsa 1 para sumar y 2 para restar");
			if (lectura.readLine().equals("1")) {
				System.out.println("Introduce el primer numero: ");
				num1 = Integer.parseInt(lectura.readLine());
				System.out.println("Introduce el primer numero: ");
				num2 = Integer.parseInt(lectura.readLine());
				
				resSuma = printer.suma(num1, num2);
				System.out.println("Resultado de Suma: "+resSuma);
				
			}else if (lectura.readLine().equals("2")) {
				System.out.println("Introduce el primer numero: ");
				num1 = Integer.parseInt(lectura.readLine());
				System.out.println("Introduce el primer numero: ");
				num2 = Integer.parseInt(lectura.readLine());
				
				resResta = printer.resta(num1, num2);
				System.out.println("Resultado de Resta: "+resResta);
			}
			
			
			
			
		} catch (NotBoundException | NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
