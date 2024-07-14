package com.synechron.java.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	
	public static void main(String[] args) 
	{
		Set s = new TreeSet();
		
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
