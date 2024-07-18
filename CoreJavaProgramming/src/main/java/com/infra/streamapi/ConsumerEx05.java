package com.infra.streamapi;

import java.util.function.Consumer;

public class ConsumerEx05 {

	public static void main(String[] args) {
		Consumer<String> greeting = name -> System.out.print("hello"+ name);
		greeting.accept("onlychheda");
		System.out.println(greeting);
	}

}
