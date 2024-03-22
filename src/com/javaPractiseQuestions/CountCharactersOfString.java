package com.javaPractiseQuestions;

public class CountCharactersOfString {
	
	// create method of count characters in a string
	public static int countCharacters(String text) {
		
		int count = 0;
		char arr[] = text.toCharArray();
		for(int i=0; i<arr.length; i++) {
			count = count+1;
		}
		System.out.println("count os string characters: "+count);
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call above static method 
		
		countCharacters("Selenium Java");
		countCharacters("String");
		
	}

}
