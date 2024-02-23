package com.javaPractiseQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object for class to call the method
		ReverseString obj = new ReverseString();
		obj.stringReverse("Java String");
		
    }
	
	public void stringReverse(String text) {
		
		for(int i=text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println(" ");
		
	}

}
