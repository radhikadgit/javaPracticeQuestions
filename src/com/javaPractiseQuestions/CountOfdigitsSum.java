package com.javaPractiseQuestions;

import java.util.Scanner;

public class CountOfdigitsSum {
	
	public void sumOfDigits() {
		
		//taking number from Scanner class
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =scan.nextInt();
		
		int rem = 0;
		while(num>0) {
			
		    rem = rem + num%10;   //0+5+6+5 =16
			num = num/10;
		}
		System.out.println("Sum of digits in given number: "+rem);
	}

	public static void main(String[] args) {
		
		CountOfdigitsSum digitSum = new CountOfdigitsSum();
		digitSum.sumOfDigits();
	}

}
