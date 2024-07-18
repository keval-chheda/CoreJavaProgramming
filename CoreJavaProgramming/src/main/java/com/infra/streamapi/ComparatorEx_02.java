package com.infra.streamapi;

import java.util.Comparator;

public class ComparatorEx_02 {

	public static void main(String[] args) {

		Comparator<Integer> comparator1 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}

		};
		System.out.println(comparator1.compare(4, 4));

//		comparator without method declaration
		Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println(comparator2.compare(4, 4));

		
	}
	

}
