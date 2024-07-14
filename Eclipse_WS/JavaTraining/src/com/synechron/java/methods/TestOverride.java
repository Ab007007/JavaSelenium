package com.synechron.java.methods;

public class TestOverride extends AdditionDemo {

	
	@Override
	public void sum(double a) {
		System.out.println("Overrided method!!!");
		super.sum(a);
	}
	
		
	public static void main(String[] args) {
		TestOverride to1 = new TestOverride();
		AdditionDemo to3 = new AdditionDemo();
		
	//	TestOverride to2 = new AdditionDemo();
		
		AdditionDemo to4 = new TestOverride();
		
		
		to1.sum(100);
		to3.sum(222);
		to4.sum(555);
		
		System.out.println(to1.sum("Aravinda", " HB"));
	
	}
	
}
