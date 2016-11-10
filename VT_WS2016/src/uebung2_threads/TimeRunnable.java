package uebung2_threads;

import java.text.DateFormat;
import java.util.Date;

//waits 1 seconds and then prints the current time
public class TimeRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(DateFormat.getTimeInstance().format(new Date()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}
