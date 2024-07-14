package com.synechron.java.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synechron.java.constructor.Employee;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		System.out.println("Total elements : " + al.size());
		
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		al.add(new Employee());
		
		System.out.println("Total elements : " + al.size());
				
		//System.out.println(al.get(0));
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("element at index " + i + " is " + al.get(i));
		}
		
		
	}

}
