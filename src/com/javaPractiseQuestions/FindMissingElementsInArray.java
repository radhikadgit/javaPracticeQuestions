package com.javaPractiseQuestions;

public class FindMissingElementsInArray {

	public static void main(String[] args) {
		
		int arr[] = {3,8,6,35,23,20,14,27,31,5,9,2,0,15};  // 0 to 35
		
		int copyArr[] = new int[40];
		
		for( int it:arr) {
			copyArr[it] = 1;
		}
		
		System.out.print("Missing numbers in an Array : ");
		
		for(int i=0; i<copyArr.length; i++) {
			
			if(copyArr[i]==0) {
				System.out.print(i+",");
			}
		}
	}

}
