package com.javaPractiseQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInAnArray {
	
	public static void sortElements() {
		
		int arr[] = {90,30,10,40,80,50};
		
		System.out.println("Before sorting: "+Arrays.toString(arr));
		//Arrays.parallelSort(arr);
		Arrays.sort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
	}
	
	public static void sortElementsDescOrder() {
		
		Integer a[] = {50,40,90,23,45,1,86};
		System.out.println("Before sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After Sorting Descending Order: "+Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		sortElements();
		sortElementsDescOrder();
	}

}
