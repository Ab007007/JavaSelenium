package com.synechron.java.string;

public class StringBuilderDemo {

	
	public static void main(String[] args) 
	{
		
		String strObj = new String("ahb123@gmail.com");
		
		StringBuilder str = new StringBuilder(strObj);
		
		System.out.println("Hash code : " + str.hashCode() + " and Str : " + str);
		
		str.append("xxxx");
		
		System.out.println("Hash code : " + str.hashCode() + " and Str : " + str);
		
		System.out.println("Length of the String : " + str.length());
		
		System.out.println("Character of a given index : " + str.charAt(0));
		
		System.out.println("Index of a given character : " + str.indexOf("@"));
		
		System.out.println("Last Index of a given character : " + str.lastIndexOf("@"));
		
		System.out.println("Find char after @ " + str.indexOf("a", str.indexOf("@")));
		
		System.out.println("Partial String " + str.substring(0, str.indexOf("@")));
		
	//	System.out.println("Contains string " + str.contains(".com"));
		
		System.out.println("Equals : " + str.equals("ahb123@gmail.com"));
		
//		System.out.println("Equals : " + str.equalsIgnoreCase("AHB123@gmail.com"));
		
//		System.out.println("Starts with : " + str.startsWith("a"));
		
//		System.out.println("Ends with : " + str.endsWith("com"));
		
//		System.out.println("Replace with : " + str.replace("ahb123", "aravindahb"));
		
		
		String str2 = "    ABC   ";
		
		System.out.println("Length of the string : " + str2.length());
		
		System.out.println("Trim and get length " + str2.trim().length());
		
		
		String str3 = "Hello all how are you doing today";
		
		System.out.println("total number of words in a given string " + str3.split(" ").length);
		
		System.out.println("Upper case : " + str3.toUpperCase());
		
		System.out.println("Lower case : " + str3.toLowerCase());
		
		System.out.println("Format : " + String.format("My name is %s and I'm %d years old", "Aravinda",40));
		
		System.out.println("String to Array : " );
		
		char[] arry = str3.toCharArray();
		
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]);
		}
	
	
	
	}
}
