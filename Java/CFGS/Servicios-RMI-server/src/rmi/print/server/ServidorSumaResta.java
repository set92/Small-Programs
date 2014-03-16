package rmi.print.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.print.common.InterfazSumaResta;

public class ServidorSumaResta extends UnicastRemoteObject implements InterfazSumaResta {
	private static final long serialVersionUID = 1L;

	protected ServidorSumaResta() throws RemoteException {
		super();
	}

	@Override
	public int resta(int num1, int num2) throws RemoteException {
		return num1-num2;
	}

	@Override
	public int suma(int num1, int num2) throws RemoteException {
		return num1+num2;
	}

	public static void main(String[] args) {
		try {
			Registry r = LocateRegistry.getRegistry();
			r.rebind("printer", new ServidorSumaResta());
			System.out.println("Servidor Iniciado");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
