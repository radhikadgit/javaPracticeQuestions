package com.javaPractiseQuestions;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x = 34;
		int y = 4;
		
	    //finding largest number in given numbers
		if(x>y) {
			System.out.println("Largest Number: "+x);
		}else if(x<y) {
			System.out.println("Largest Number: "+y);
		}
		
		// without using if else condition we can use ternary oparetor in java
		int largeNum ;
		largeNum = (x>y) ? x : y;
		System.out.println(largeNum);
	}

}
