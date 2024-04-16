package com.javaPractiseQuestions;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,8,9,10};   // it should be in sorted order
		
		int key = 5;
		int lowLimit = 0;
		int highLimit = arr.length-1 ;
		System.out.println("Higher limit "+highLimit);
		boolean flag = false;
		
		while(lowLimit <= highLimit) {
			
			int mid = (lowLimit+highLimit)/2;
			
			if(arr[mid] == key) {
				System.out.println("Element found");
				flag = true;
				break;
			}
			else if(arr[mid] < key) {
				 
				lowLimit = mid + 1;
			}
			else if(arr[mid] > key) {
				
				highLimit = mid - 1;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}
	
  //    System.out.println(Arrays.binarySearch(arr, 9));
	}

}
