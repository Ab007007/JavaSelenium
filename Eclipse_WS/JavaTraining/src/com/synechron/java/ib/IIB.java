package com.synechron.java.ib;

public class IIB {
	static int counter=0;
	
	{
		++counter;
		System.out.println("IIB Executed first");
	}
	
	public IIB() {
		System.out.println("Constructor called\n\n");
	}
	
	public IIB(int i) {
		System.out.println("Constructor called\n\n");
	}
	
	public IIB(String s) {
		System.out.println("Constructor called\n\n");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		new IIB();
		new IIB(2);
		new IIB(4);
		new IIB("AA");
		new IIB("SS");
		new IIB();
		
		
		System.out.println("total number of objects created to my class is " + counter);
	}
}
