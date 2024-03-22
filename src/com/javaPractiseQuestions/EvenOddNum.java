package com.javaPractiseQuestions;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOddMethod();
		EvenOddMethod();
		getEvenNum(5);
		getEvenNum(41);
	}

	public static void EvenOddMethod() {
		// Enter a number(from scanner class)in console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Given number is Even " + num);
		} else
			System.out.println("Given number is Odd " + num);

	}

	public static void getEvenNum(int num) {

		System.out.println("Even numbers in given number: "+num );
		for (int i = 0; i < num; i = i + 2) {
			System.out.println(i);
		}
	}

}
