package com.synechron.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.synechron.java.constructor.Employee;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		List al = new Vector();
		System.out.println("Total elements : " + al.size());
		
		al.add("Aravinda");
		al.add(40);
		al.add(6544646);
		al.add(true);
		al.add(new Employee());
		
		
		System.out.println("Total elements : " + al.size());
				
		//System.out.println(al.get(0));
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("element at index " + i + " is " + al.get(i));
		}
		
		
		al.add(0, "new Hero");
		al.remove(5);
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("element at index " + i + " is " + al.get(i));
		}
		
		
	}

}
