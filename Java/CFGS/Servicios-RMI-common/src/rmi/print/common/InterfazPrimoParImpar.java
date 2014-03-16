package rmi.print.common;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface InterfazPrimoParImpar extends Remote {

	public boolean numPrimo(int num1) throws RemoteException;
	public boolean parImpar(int num1) throws RemoteException;

}
