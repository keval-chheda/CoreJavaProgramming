package com.infra.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatefromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"keval", "vinod", ""};
		List<String> filteredlist = Arrays.stream(name)
				.filter(s -> s != null && !s.trim().isEmpty())
				.collect(Collectors.toList());
		
		String[] filteredArray = filteredlist.toArray(new String[0]);
		System.out.println(Arrays.toString(filteredArray));
	}

}
