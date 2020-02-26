package com.adailsilva.rmi.facid;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.adailsilva.rmi.facid.remoteinterface.RemoteInterface;
import com.adailsilva.rmi.facid.server.Server;

// Start App:
public class Main {

	public static void main(String[] args) {

		Server objeto = new Server();

		try {

			// Stub: (esbocoDeMetodo).
			RemoteInterface esbocoDeMetodo = (RemoteInterface) UnicastRemoteObject.exportObject(objeto, 0);

			// Vincula o stub do objeto remoto no registro:
			Registry registry = LocateRegistry.getRegistry();

			registry.bind("RemoteInterface", esbocoDeMetodo);
			
			System.out.println("Servidor Pronto!");

		} catch (RemoteException e) {

			System.out.println("RemoteException:");

			e.printStackTrace();

		} catch (AlreadyBoundException e) {

			System.out.println("AlreadyBoundException:");

			e.printStackTrace();
		}

	}

}
