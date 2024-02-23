package com.javaPractiseQuestions;

public class PalindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "mom";
		String result = "" ;
		
		for(int i=text.length()-1; i>=0; i--) {
			
			result = result + text.charAt(i);
			
		}
		System.out.println(result);
		System.out.println(text);
		
		
		if(text.equals(result)) {
			System.out.println("Palindrome word " + result);
		}else
		{
			System.out.println("Not Palindrome word " + result);
		}

	}

}
