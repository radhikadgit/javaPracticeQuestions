package com.javaPractiseQuestions;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {
		
		//String text = "mom";
		//enter a word from scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word ");
		String text = scan.next();
		String result = "" ;
		
		for(int i=text.length()-1; i>=0; i--) {
			
			result = result + text.charAt(i);
			
		}
		System.out.println(result);
		System.out.println(text);
		
		
		if(text.equals(result)) {
			System.out.println("Palindrome word: " + result);
		}else
		{
			System.out.println("Not Palindrome word: " + result);
		}

	}

}
