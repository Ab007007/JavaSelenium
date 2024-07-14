package com.synechron.java.methods;

public class AdditionDemo {

	
	public static void main(String[] args) 
	{
		AdditionDemo ad = new AdditionDemo();
		
		ad.sum();
		ad.sum(22, 33);
		ad.sum(12, 3);
		ad.sum(32, 23);
		ad.sum(22.22,33.33);
	
	}
	
	
	public void sum()
	{
		int a = 10;
		int b = 20;
		
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	
	public void sum(int a , int b)
	{
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	public void sum(double a , double b)
	{
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	public void sum(double a )
	{
		System.out.println("The sum of two numbers is : " + (a));
	}
	
	public final void sum(char a )
	{
		System.out.println("The sum of two numbers is : " + (a));
	}
	
	
	
	public String sum(String a , String b)
	{
		System.out.println("The sum of two numbers is : " + (a+b));
		
		return a + b;
	}
}
