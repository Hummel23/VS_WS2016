package uebung3_race_rmi.Aufgabe1;


public class Name {

	private String first;

	private String last;
	
	//setter
	//synchronized makes sure that this method is synchronized with other methods that are 
	//marked as synchronized
	//synchronized makes sure that while this method is locked for all other threads if one of the threads is in this method
	public synchronized void set(String first, String last) {
		this.first = first;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.last = last;
	}
	
	//getter
	public String get() {
		//has the same effect as 'synchronized'... locks this method from being used as long as it is used
		//by another instance of this object
		synchronized(this){
			return this.first + " " + this.last;		
		}
	}

}
