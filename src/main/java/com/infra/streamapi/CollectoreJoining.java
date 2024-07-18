package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectoreJoining {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("helo", " ", "world");
		String newname = names.stream().collect(Collectors.joining());
		System.out.println(newname);
	}

}
