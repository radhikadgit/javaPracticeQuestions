package com.javaPractiseQuestions;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String a[] = {"Java", "C++", "Selenium", "Python","Java"};
		
		boolean flag = false;
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println("String has Duplicate values: "+a[i] );
					flag = true;
				}
			}
		}
		if(flag==false) {
			
		  System.out.println("No duplicate values in the string");
		} 
	}
	
}
