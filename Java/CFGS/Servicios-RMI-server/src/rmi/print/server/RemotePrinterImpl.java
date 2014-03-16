package rmi.print.server;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.print.common.RemotePrinter;

public class RemotePrinterImpl extends UnicastRemoteObject implements RemotePrinter {
	private static final long serialVersionUID = 1L;

	protected RemotePrinterImpl() throws RemoteException {
		super();
	}

	@Override
	public String simpleRemoteMethod(String arg) throws RemoteException {
		return null;
	}

	@Override
	public int submitJob(String texto) throws RemoteException {
		System.out.println("Solicitado trabajo " +texto);
		return 0;
	}

	@Override
	public boolean isComplete() throws RemoteException {
		System.out.println("Solicitud de estado de trabajo");
		return true;
	}

	@Override
	public String getPrinterStatus() throws RemoteException {
		System.out.println("Solicitud de estado de impresora");
		return "OK";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Registry r = LocateRegistry.getRegistry();
			r.rebind("printer", new RemotePrinterImpl());
			System.out.println("Servidor Iniciado");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
