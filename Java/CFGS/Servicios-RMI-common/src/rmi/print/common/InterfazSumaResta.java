package rmi.print.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazSumaResta extends Remote {
	
	public int resta(int num1, int num2) throws RemoteException;
	public int suma(int num1, int num2) throws RemoteException;
	
}
