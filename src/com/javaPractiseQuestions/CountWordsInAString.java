package com.javaPractiseQuestions;

public class CountWordsInAString {
	
	public void countWords() {
		
		String str = "Welcome To Java Selenium TestNg";
		String[] words =str.split(" ");
		
	    int count=0;
	    for(String word:words) {
	    	count++;
	    }
	    System.out.println("Number of words in a String: "+count);
	}

	public static void main(String[] args) {
		
		CountWordsInAString cws= new CountWordsInAString();
		cws.countWords();
		
	}

}
