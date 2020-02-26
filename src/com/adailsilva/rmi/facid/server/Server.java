package com.adailsilva.rmi.facid.server;

import java.rmi.RemoteException;

import com.adailsilva.rmi.facid.remoteinterface.RemoteInterface;

// Uma implementação de objeto remoto que implementa a interface remota:
public class Server implements RemoteInterface {
	
	// Construtor:
	public Server() {}

	@Override
	public String trabalhoRmiFacid() throws RemoteException {
		
		return "Trabalho AP2, RMI.";
	}

}