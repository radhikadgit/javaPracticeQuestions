package com.javaPractiseQuestions;

import java.util.Scanner;

public class ReverseEachWordInAString {
	
	public static void reverseEachWord() {
		
		//User  enter string
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();   // Welcome to java
		
		//split the words in a sentence using string.split();
		String[] words =str.split(" ");
		String reverseString = "";
		
		//for each loop
		for(String word:words) {
			
			String reverseWord="";
			
			for(int i= word.length()-1; i>=0; i--) {
				
				reverseWord = reverseWord+word.charAt(i);
				
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println("Reverse String Sentence: "+ reverseString);
		
	}

	public static void main(String[] args) {

		reverseEachWord();
		
	}

}
