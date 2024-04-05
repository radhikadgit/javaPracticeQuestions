package com.javaPractiseQuestions;

import java.util.Scanner;

public class LargestNumberIngivenNumbers {

	public static void main(String[] args) {
		
		// finding largest number in 3 numbers		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int n1 = scan.nextInt();
        
        System.out.println("Enter Second Number ");
        int n2 = scan.nextInt();
        
        System.out.println("Enter Third Number ");
        int n3 = scan.nextInt();
        
        if(n1>n2 && n1>n3) {
        	System.out.println(n1 +" is the Largest Number");
        }
        else if(n2>n1 && n2>n3) {
        	System.out.println(n2 +" is the Largest Number");
        }
        else {
        	System.out.println(n3 +" is the Largest Number");
        }	
	}

}
