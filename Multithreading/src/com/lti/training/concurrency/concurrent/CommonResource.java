package com.lti.training.concurrency.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CommonResource {
	 
	 
	 private String names[];
	  Lock
	  
	  lock=new ReentrantLock();
	  
	  
	  synchronized static void manageArray() {
		  System.out.println("My static block");
			// Read and write operation
			// CommonResource 
		}
	  synchronized  static void changeArray() {
			// Read and write operation
		}
	  void testArray() {
			
			synchronized(this) { 
			
			}
			
			lock.unlock();
			
			
		}
	  class Thread1 extends Thread{
			public void run() {
				synchronized(CommonResource.class) {
					
				}
				
			}
	  }
}


	  

	

