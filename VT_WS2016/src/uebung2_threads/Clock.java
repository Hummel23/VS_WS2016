package uebung2_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Clock {
	
	public static void main(String[] args) throws InterruptedException {
		
		// defines how many operations will be started
		int concurrentOps = 1;
		
		// instantiates a threadpool with the number of threads defined in currentOps
		ExecutorService pool = Executors.newFixedThreadPool(concurrentOps);
		
		//adds 10 Threads to the threadpool (type TimeRunnable) -> every second the current time is printed
		for (int i = 0; i < concurrentOps * 10; i++) {
			pool.submit(new TimeRunnable());
		}
		
		//finishes executed threads, but does not start waiting tasks. returns a list of tasks that was awaiting handling
		pool.shutdown();
		while (!pool.isShutdown()) {
			
			//pool is waiting 500 milliseconds before terminating 
			pool.awaitTermination(500, TimeUnit.MILLISECONDS);
		}
	}
}
