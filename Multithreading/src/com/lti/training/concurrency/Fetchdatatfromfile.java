package com.lti.training.concurrency;

public class Fetchdatatfromfile  implements Runnable{
	
	private String fileName; 
	
	public Fetchdatatfromfile(String fileName ) {
		this.fileName=fileName;
	}
		
	
	
	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	@Override
	public void run() {
	
	try
	{
		System.out.println("Fetching data from :" +fileName + "by" +Thread.currentThread().getName());
		
		//read from file
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}



//create 1 thread but 10 taks
