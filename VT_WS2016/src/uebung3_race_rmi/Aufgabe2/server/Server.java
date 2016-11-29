package uebung3_race_rmi.Aufgabe2.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import uebung3_race_rmi.Aufgabe2.IPAddress;

public class Server {

	public static void main(String[] args) throws RemoteException{

		HelloWorldImpl helloWorld = new HelloWorldImpl();

			try {
				System.out.println("Server started...");
				LocateRegistry.createRegistry(1099);
				HelloWorldImpl obj = new HelloWorldImpl();
				Naming.rebind("rmi://" + IPAddress.OWNSERVERIP + "/Server", obj);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Server could not be started. ");
			}
		


	}
}
