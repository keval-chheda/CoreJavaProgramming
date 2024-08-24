package com.infra.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronizedHashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> syncMap = Collections.synchronizedMap(new HashMap<>());
		syncMap.put(1, "keval");
		syncMap.put(2, "vinod");
		syncMap.put(3, "chheda");
		
//		synchronized (syncMap) {
//			for(Integer key : syncMap.keySet()) {
//				System.out.println(key +","+ syncMap.get(key));
//			}
		synchronized (syncMap) {
			for(Entry<Integer, String> key : syncMap.entrySet()) {
				System.out.println(key.getValue() +","+ key.getKey());
				
			}
			
		}
	}

}
