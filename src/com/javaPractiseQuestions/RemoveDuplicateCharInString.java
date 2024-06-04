package com.javaPractiseQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "Selenium Automation"; //Selnium Atoa
		
		str=str.toLowerCase();              //selnium ato
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
		for(Character c:set) {
			System.out.print(c);
		}

	}

}
