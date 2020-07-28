package com.lti.training.concurrency;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Double> {
	
	private double  value;

	
		
	
	public Factorial(double value) {
	
		this.value = value;
		
	}

	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		
	
		System.out.println("calculating factorial" +Thread.currentThread().getName());
		Thread.sleep(5000);
		double fact=1;
		for(int i=1;i<10;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
