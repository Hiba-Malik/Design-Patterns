package guardedSuspension;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
	  /**
	   * Example pattern execution
	   *
	   * @param args - command line args
	   */
	  public static void main(String[] args) {
	    GuardedQueue guardedQueue = new GuardedQueue();
	    ExecutorService executorService = Executors.newFixedThreadPool(3);

	    //here we create first thread which is supposed to get from guardedQueue
	    executorService.execute(() -> {
	          guardedQueue.get();
	        }
	    );
	   
	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    executorService.execute(() -> {
	          guardedQueue.put(20);
	        }
	    );
	    executorService.shutdown();
	    try {
	      executorService.awaitTermination(30, TimeUnit.SECONDS);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }

	}