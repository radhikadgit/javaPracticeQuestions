package com.javaPractiseQuestions;

public class FibbonacciSeries {

	public static void main(String[] args) {

		// Fibonacci Series - 0,1,1,2,3,5,8,13,21...
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);

		for (int i = 1; i <= 10; i++) {
			
			sum = n1 + n2;  // 0+1 1+1 1+2 2+3
			n1 = n2;        // 1 1 2 3
			n2 = sum;       // 1 2 3 5
			System.out.print(" " + sum);
		}

	}

}
