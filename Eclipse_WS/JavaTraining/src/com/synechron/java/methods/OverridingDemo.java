package com.synechron.java.methods;

import com.synechron.java.variables.Person;

public class OverridingDemo {

	
	static Person p1 ;
	public static void main(String[] args) 
	{
		p1 = new Person();
		p1.name = "Aravind";
		p1.phoneNumber = 7785858555L;
		p1.height = 5.8;
		p1.weight = 78;
		p1.country = "India";
		

		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "Harry";
	//	p2.company = "IBM";
		System.out.println(p2);

		
		
	}
	
	
	public static void test() {
		System.out.println(p1);
		//System.out.println(p2);
	}
}
