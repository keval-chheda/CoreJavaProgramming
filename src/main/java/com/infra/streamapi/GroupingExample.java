package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("keval", "nakshi", "vinod");
		
		Map<Integer, List<String>> grouping= names.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(grouping);
	}

}
