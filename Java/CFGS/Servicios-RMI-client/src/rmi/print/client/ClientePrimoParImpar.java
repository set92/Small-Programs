package rmi.print.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import rmi.print.common.InterfazPrimoParImpar;

public class ClientePrimoParImpar {

	public static void main(String[] args) {
		int num1, opcion;
		boolean resPrimo, resParImpar;
		System.setSecurityManager(new RMISecurityManager());
		try {
			InterfazPrimoParImpar printer = (InterfazPrimoParImpar) Naming.lookup("rmi://localhost/printer");

			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1. Numero primo" +
					"\n 2. Par - Impar" +
					"\n 3. Salir");
			switch (lectura.readLine()) {
			case "1":
				System.out.println("Introduce el numero: ");
				num1 = Integer.parseInt(lectura.readLine());
				resPrimo = printer.parImpar(num1);
				if (resPrimo) {
					System.out.println("El numero es primo");
				}else {
					System.out.println("El numero no es primo");
				}
				break;
			case "2":
				System.out.println("Introduce el numero: ");
				num1 = Integer.parseInt(lectura.readLine());

				resPrimo = printer.numPrimo(num1);
				if (resPrimo) {
					System.out.println("El numero es primo");
				}else {
					System.out.println("El numero no es primo");
				}
				break;
			case "3":

				break;

			default:
				break;
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
