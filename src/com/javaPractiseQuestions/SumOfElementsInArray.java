package com.javaPractiseQuestions;

public class SumOfElementsInArray {
	
	public static void sumOfElements() {
		
		int arr[] = {2,4,2,1};
		//int a[]   = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];   //2+4+3+8
		}
		System.out.println("Sum of arrray elements: "+sum);
		
	}

	public static void main(String[] args) {
		
		sumOfElements();
		

	}

}
