package com.infra.corejava;

import java.util.stream.IntStream;

public class PrimeCheckIntStream {

	public static void main(String[] args) {
		int i = 17;
		System.out.println(i + "is prime number " + checkPrimeIntStream(i));
	}

	private static boolean checkPrimeIntStream(int i) {
		if( i <= 1) {
			return false;
		}
		
		return IntStream.range(2, i)
				.noneMatch(s -> i%2 ==0);
	}

}
