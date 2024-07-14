package com.synechron.java.variables;

public class Person {

	
	@Override
	public String toString() {
		String str = "\n**********************************\n"
				+ "The Object Values are"
				+ "\nPerson Name : " + this.name 
				+ "\nPerson phone number : " + this.phoneNumber
				+ "\nPerson height : " + this.height
				+ "\nPerson Weight : " + this.weight
				+ "\nPerson Company : " + Person.company
				+ "\nPerson Belongs to  : " + Person.country ;
		
		return str;
	}
	//Global Variables
	public String name;
	public long phoneNumber;
	public double height;
	public double weight;
	public final static String company = "Synechron";
	public static String country = "India";
	
	
}
