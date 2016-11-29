package uebung3_race_rmi.Aufgabe2.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld{

	public HelloWorldImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello(String user) throws RemoteException{
		return "Hello " + user;
	}
	


}
