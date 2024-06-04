package com.javaPractiseQuestions;

public class CountCharactersInAString {

	public static void main(String[] args) {
		
		String str = "hello Java Selenium TestNg";
		String str1=str.toLowerCase();
		int totalLength = str1.length();
		System.out.println(totalLength);
		
		//count white spaces in a string
		int afterRemoveChar =str1.replace("n", "").length();
		System.out.println(afterRemoveChar);
		
		int count = totalLength-afterRemoveChar;
		System.out.println(count);
	}

}
