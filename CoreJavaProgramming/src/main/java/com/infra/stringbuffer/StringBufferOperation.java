package com.infra.stringbuffer;

public class StringBufferOperation {

	public static void main(String[] args) {
		StringBuffer newString = new StringBuffer("Hello");
		newString.append("friend");
		System.out.println(newString);
		
		newString.insert(6, "wassup!").toString();
		System.out.println(newString);
	}

}
