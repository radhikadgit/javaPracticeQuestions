package com.javaPractiseQuestions;

public class CountCharactersInAString {

	public static void main(String[] args) {
		
		String str = "Java Selenium TestNg";
		String str1=str.toLowerCase();
		int totalLength = str1.length();
		
		int afterRemoveChar =str1.replace("n", "").length();
        
		int count = totalLength-afterRemoveChar;
		System.out.println(count);
	}

}
