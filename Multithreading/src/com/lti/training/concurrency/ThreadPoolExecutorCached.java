package com.lti.training.concurrency;



import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorCached {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		for(int i=1;i<=10;i++) {
			Fetchdatatfromfile fetch = new Fetchdatatfromfile("File-" + i);
			// submit the task to thread pool
			executor.execute(fetch);  // any implementation of Runnable
		}
		
		// shutdown the executor
		executor.shutdown();
	}


}
