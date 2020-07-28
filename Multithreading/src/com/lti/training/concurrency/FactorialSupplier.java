package com.lti.training.concurrency;

import java.util.function.Supplier;

public class FactorialSupplier  implements Supplier<Double>{
	private double value;
	

	public FactorialSupplier(double value) {

		this.value = value;
	}


	@Override
	public Double get() {
		System.out.println("Calculating Factorial : " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		     } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		     }
double fact=1;
for(int i=1;i<10;i++) {
	

fact*=i;
}
return fact;
		// TODO Auto-generated method stub
		
	}
	
		
	}
	

