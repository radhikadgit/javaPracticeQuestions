package com.javaPractiseQuestions;

public class CountOfDigitsInANumber {
	
	public static void countDigits(int num) {
				
		int count = 0;
		
		while(num>0) {
			
			int reminder = num%10; 
			num = num/10;
			count++;
		}
		System.out.println("Count of digits in a number: "+count);
	}

	public static void main(String[] args) {
		
		countDigits(2345);
		countDigits(2309845);

	}

}
