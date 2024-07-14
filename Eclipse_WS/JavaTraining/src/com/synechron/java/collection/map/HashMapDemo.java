package com.synechron.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	
	public static void main(String[] args) {
		Map mp = new HashMap();
		mp.put("name", "Aravinda");
		mp.put("age", 41);
		mp.put("address", "Bangalore");
		
		System.out.println(mp.get("name"));
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		String key = null;
		while(it.hasNext())
		{
			key = (String)it.next();
			System.out.println(key + " : " + mp.get(key));
		}
		
	}

}
