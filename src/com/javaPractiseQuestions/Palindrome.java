package com.javaPractiseQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Palindrome Program
		
		int num = 878;
		int reverse = 0;
		int temp = num;
		
		while(num>0)
		{
			int x = num % 10;
			reverse = reverse *10 + x;
			num = num/10;
		}
		if(reverse == temp) {
			
		    System.out.println("Given number is Palindrome "+ reverse);
		
		}else {
			System.out.println("Given number is not Palindrome "+ reverse);
		}
			
	}

}
