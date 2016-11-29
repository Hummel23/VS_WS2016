package uebung3_race_rmi.Aufgabe2.client;

import java.rmi.Naming;

import uebung3_race_rmi.Aufgabe2.IPAddress;
import uebung3_race_rmi.Aufgabe2.server.HelloWorld;

public class Client {

	public static void main(String[] args) {
		try{
			
			String serverUrl = "rmi://" + IPAddress.FOREIGNSERVER + "/Server";
			HelloWorld helloWorld = (HelloWorld)Naming.lookup(serverUrl);
			System.out.println(helloWorld.sayHello(" Saba!" ));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
