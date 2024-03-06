package com.javaPractiseQuestions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user enter number multiplication table
		MultiplicationTable.tables();

	}

	public static void tables() {

		// taking number from user using Scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number and press enter ");
		int num = scan.nextInt();
        
		for (int i = 1; i <= 10; i++) {

			int multplyTable = num * i;
			System.out.println(num + "*" + i + "=" + multplyTable);
		}
	}

}
