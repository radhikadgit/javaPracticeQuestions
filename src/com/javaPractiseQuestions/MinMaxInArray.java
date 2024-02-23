package com.javaPractiseQuestions;

import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 423, 6, 46, 34, 23, 13, 53, 4 };

		// for minimun and maximum element using Sort()

		Arrays.sort(arr);
		int minElement = arr[0];
		int maxElement = arr[arr.length - 1];
		System.out.println("minimum Element " + minElement + " maximum Element " + maxElement);

		// other way using forloop
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("maxiumm " + max + " minimum " + min);

		// ANOTHER WAY - using java streams

		int max1 = Arrays.stream(arr).max().getAsInt();
		System.out.println("Maximum is " + max);
		int min1 = Arrays.stream(arr).min().getAsInt();
		System.out.println("Minimum is " + min);

	}

}
