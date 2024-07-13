package com.infra.dsa.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorMap {
	
	public static void main(String[] args) {

		Map<String, Integer> mapdata = new HashMap<>();
		mapdata.put("Keval", 1);
		mapdata.put("Sachin", 2);
		mapdata.put("sachin", 3);
		
		Iterator<Map.Entry<String, Integer>> iterator = mapdata.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String name = entry.getKey();
			Integer number = entry.getValue();
			
			System.out.println("name "+ name +"key is "+ number);
		}
		
		for(Map.Entry<String, Integer> entry : mapdata.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("keys is "+ key+ "and value is "+value);
		}
		
		}
	}

