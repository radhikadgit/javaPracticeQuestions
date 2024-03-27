package com.javaPractiseQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Palindrome Program
		// int num = 878;
		// enter number from Scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();

		int reverse = 0;
		int temp = num;

		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;

		}
		if (reverse == temp) {

			System.out.println("Given number is Palindrome " + reverse);

		} else {
			System.out.println("Given number is not Palindrome " + reverse);
		}

	}

}
