package rmi.print.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import rmi.print.common.RemotePrinter;

public class PrintClient {

	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());
		try {
			RemotePrinter printer = (RemotePrinter) Naming.lookup("rmi://localhost/printer");
			int jobID = printer.submitJob("Hola Mundo");
			System.out.println("Trabajo realizado "+jobID);
			System.out.println("Esta realizado el trabajo? "+printer.isComplete());
			System.out.println("Estado de la impresora: "+printer.getPrinterStatus());
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}

}
