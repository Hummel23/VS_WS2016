package uebung3_race_rmi.Aufgabe1;

public class Main {

	public static void main(String[] args) {
		final Name name = new Name();
		

		Thread setter = new Thread(new Runnable() {
			@Override
			public void run() {
				name.set("Donald", "Trump");
				name.set("Barack", "Obama");
			}
		});
	
		
		Thread getter = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (i < 20) {
					System.out.println(name.get() + i);
					i++;
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		setter.start();

		getter.start();


		Thread.yield();
	}
}
