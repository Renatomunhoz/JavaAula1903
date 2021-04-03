package br.com.renato;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class ChatServer {

	
	public ChatServer() throws RemoteException {
		
		try {
			
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/chat", new ChatAula());
			System.out.println("Rodando...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main (String [] args) throws RemoteException {
		new ChatServer();
		
	}
	
}
