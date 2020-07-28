package com.lti.training.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class ThreadPoolExecutorFixed {

	public static void main(String[] args) {
		
	ThreadPoolExecutor executor	=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
		// TODO Auto-generated method stub
	
	for(int i=1;i<10;i++) {
		Fetchdatatfromfile fetch= new Fetchdatatfromfile("file  "  +  i );
		executor.execute(fetch);
		
	}

	}

}
