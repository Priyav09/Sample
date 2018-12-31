package test;

import java.lang.instrument.Instrumentation;

class sample1 implements Runnable {

	
	public int a = 3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running");
	}
	
}

public class sample {
	
	public static Instrumentation inst ;
	
	public static void main(String args[]) {
		sample1 s = new sample1();
		System.out.println(inst.getObjectSize(s));
	}
}