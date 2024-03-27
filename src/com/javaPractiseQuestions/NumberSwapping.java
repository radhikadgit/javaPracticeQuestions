package com.javaPractiseQuestions;

public class NumberSwapping {

	public static void main(String[] args) {
		
		// method 1. using third variable		
		int a = 10, b = 20, c;
		System.out.println("Before swapping "+ " a= "+ a + " b= "+b);
//		c = a;
//		a = b;
//		b = c;
//		System.out.println("After swapping "+ " a= "+ a + " b= "+b);
		
		// Method 2. with out using third variable
		a = a+b;  // 10+20 = 30
		b = a-b;  // 30-20 = 10
		a = a-b;  // 30-10 = 20
		System.out.println("After swapping "+ " a= "+ a + " b= "+b);

	}

}
