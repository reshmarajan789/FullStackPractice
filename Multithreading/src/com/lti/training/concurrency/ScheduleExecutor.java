package com.lti.training.concurrency;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduleExecutor {


			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				ScheduledExecutorService executor =  Executors.newScheduledThreadPool(3);
				for(int i=1;i<=5;i++) {
					Fetchdatatfromfile fetch = new Fetchdatatfromfile("File-" + i);
					// we can define the schedule to run
					executor.scheduleAtFixedRate(fetch, 5, 10, TimeUnit.SECONDS);
				}
				
				Thread.sleep(40000);
				
				executor.shutdown();
			}
		// TODO Auto-generated method stub

	

}
