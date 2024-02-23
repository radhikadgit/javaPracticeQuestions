package com.javaPractiseQuestions;

public class UpperLowerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "WelcomE To AutomatioN";
		int upperCount = 0;
		int lowerCount = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if(ch>=65 && ch<=90) {
				upperCount++;
			}else
				lowerCount++;
		}
		System.out.println("Upper Case Count "+ upperCount);
		System.out.println("Lower Case Count "+ lowerCount);
	}

}
