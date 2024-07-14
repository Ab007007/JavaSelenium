package com.synechron.java.access.pack1;

public class A {

	
	private int a = 10;
	int b = 20;
	protected int c =30;
	public int d = 40;
	
	private void test1()
	{
		System.out.println("Private function");
	}
	
	void test2()
	{
		System.out.println("Default function");
	}
	
	protected void test3()
	{
		System.out.println("protected function");
	}
	
	public void test4()
	{
		System.out.println("public function");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}
}
