package com.infra.dsa.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingLinkedList {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		// adding elements using add method
		names.add("keval");
		names.add("vinod");
		names.add("chheda");

//		using basic loop
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}

//		using foreach loop
		names.forEach(s -> System.out.println(s));

//		using enhanced loop
		for (String name : names) {
			System.out.println(name);
		}

//		using Iterator
		Iterator<String> nameIterator = names.iterator();
		while (nameIterator.hasNext()) {
			String name = nameIterator.next();
			System.out.println(name);
		}
	}

}
