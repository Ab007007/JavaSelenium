package com.synechron.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) 
	{
		Set s = new LinkedHashSet();
		
		s.add(25);
		s.add(35);
		s.add(5);
		s.add(5);
		s.add(55);
		s.add(1);
		s.add(25);
		s.add(35);
		s.add(5);
		s.add(5);
		s.add(55);
		s.add(1);
		
		System.out.println("Total elements in collection " + s.size());
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
