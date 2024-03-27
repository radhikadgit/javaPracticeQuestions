package com.javaPractiseQuestions;

import java.util.Scanner;

public class PrimenumberOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		// a number multiply by 1 and by itself is Prime number ex: 1,3,5,11,29 etc
		// count 2 times
		
		int count = 0;
		
		if(num>0) {
			
			for(int i=1; i<=num; i++) {
				
				if(num%i == 0) {
					count++;
				}				
			}
			if(count == 2) {
				System.out.println("Given number is a Prime number");
			}
			else {
				System.out.println("Given number is not a Prime number");	
			}
		}
		else {
			System.out.println("Given number is not a Prime number");
		}
		

	}

}
