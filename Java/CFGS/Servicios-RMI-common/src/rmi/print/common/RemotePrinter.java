package rmi.print.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemotePrinter extends Remote {

	/** This is a sample method. Delete it and add one of your own. */
	public String simpleRemoteMethod(String arg) throws RemoteException;
	public int submitJob(String texto) throws RemoteException;
	public boolean isComplete() throws RemoteException;
	public String getPrinterStatus() throws RemoteException;

}
