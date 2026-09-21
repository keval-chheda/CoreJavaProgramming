package com.corejava.collections.maps;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		// Add sample entries to a thread-safe map and inspect its contents.
		ConcurrentHashMap<String, String> conMap = new ConcurrentHashMap<>();
		conMap.put("demo1", "testing1");
		conMap.put("demo2", "testing2");
//		
//		Iterator <Entry <String, String>>Iteratingmap = conMap.entrySet().iterator();
//		while(Iteratingmap.hasNext()) {
//			Entry <String, String> itrconMao = Iteratingmap.next();
//			System.out.println(itrconMao.getKey()+","+ itrconMao.getValue());
//		}

		KeySetView<String, String> conKeySet = conMap.keySet();
		for(String conkeyIterator : conKeySet ) {
			System.out.println(conkeyIterator +""+ conMap.get(conkeyIterator));
			
		}
	}

}
