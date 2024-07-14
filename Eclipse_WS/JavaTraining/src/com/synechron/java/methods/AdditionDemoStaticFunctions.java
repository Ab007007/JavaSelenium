package com.synechron.java.methods;

public class AdditionDemoStaticFunctions {

	
	public static void main(String[] args) 
	{
		
		sum();
		sum(22, 33);
		sum(12, 3);
		sum(32, 23);
		sum(22.22,33.33);
	
	}
	
	
	public static void sum()
	{
		int a = 10;
		int b = 20;
		
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	
	public static void sum(int a , int b)
	{
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	public static void sum(double a , double b)
	{
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	public static void sum(double a )
	{
		System.out.println("The sum of two numbers is : " + (a));
	}
	
}
