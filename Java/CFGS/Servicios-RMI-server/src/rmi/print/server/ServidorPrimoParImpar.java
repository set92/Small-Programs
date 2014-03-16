package rmi.print.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.print.common.InterfazPrimoParImpar;

public class ServidorPrimoParImpar extends UnicastRemoteObject implements InterfazPrimoParImpar{

	private static final long serialVersionUID = 1L;

	protected ServidorPrimoParImpar() throws RemoteException {
		super();
	}

	@Override
	public boolean numPrimo(int num1) throws RemoteException {
		int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=num1)){
		    if (num1 % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
	}

	@Override
	public boolean parImpar(int num1) throws RemoteException {
		if (num1%2!=0)
		    return true;
		  else
		    return false;
	}
	
	public static void main(String[] args) {
		try {
			Registry r = LocateRegistry.getRegistry();
			r.rebind("printer", new ServidorPrimoParImpar());
			System.out.println("Servidor Iniciado");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
