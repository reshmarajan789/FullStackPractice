package com.lti.training.concurrency;

import java.util.concurrent.Callable;

public class FactorialPro  implements Callable<Double>{
	
	private double value;
	private int sleepTime;
	public FactorialPro(double value, int sleepTime) {
	
		this.value = value;
		this.sleepTime = sleepTime;
	}
	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Calculating Factorial : " + Thread.currentThread().getName());
		double fact=1;
		for(int i=0;i<10;i++) {
				fact*=i;
		}
		System.out.println("Factorial Calculated: " + value);
		return fact;
	
	
	

}
}
