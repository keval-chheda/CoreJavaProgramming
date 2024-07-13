package com.infra.dsa.map;

import java.util.Map;
import java.util.TreeMap;

public class CharCountMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		Map<Character, Integer> charMap = new TreeMap<>();
		for(char ch : s.toCharArray()) {
			charMap.put(ch, charMap.getOrDefault(ch, 0)+ 1);
		}
		
		for(Map.Entry<Character, Integer> entry: charMap.entrySet() ) {
			System.out.println(entry.getKey() +","+ entry.getValue());
		}

	}

}
