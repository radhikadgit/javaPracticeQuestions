package com.javaPractiseQuestions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create reference object of class to call the method
		Factorial fc = new Factorial();
		fc.factorialNum(3);
		fc.factorialNum(5);
	}
	
	//method 
	public void factorialNum(int num) {
	
		int fact = 1;
		for(int i=1; i<=num; i++) {
		 fact = fact * i;
		}
		System.out.println("Factorial of "+num+ " is "+fact);
		
	}

}
