package com.javaPractiseQuestions;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {2, 4, 61, 54, 40, 70};
		
		int searchEle = 70;
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			
			if(searchEle==a[i]) {
				
				System.out.println("element found "+i+"Th index");
				flag=true;
				break;
			}			
		}
		if(flag==false) {
			System.out.println("not found element");
		}

	}

}
