package uebung3_race_rmi.Aufgabe2.server;

import java.rmi.*;


public interface HelloWorld extends Remote {
	
	public String sayHello(String user) throws RemoteException;

}
