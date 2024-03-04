package com.javaPractiseQuestions;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a hashmap object
		HashMap<String, Integer> hmPeople = new HashMap<String, Integer>();
		
		//add peple age 
		hmPeople.put("Debra", 34);
		hmPeople.put("Stella", 29);
		hmPeople.put("Daniel", 39);
		
		for(String peopleName : hmPeople.keySet()) {
			
			System.out.println(peopleName + " "+ hmPeople.get(peopleName));
		}
		
		boolean peopleEmpty = hmPeople.isEmpty();
        System.out.println(peopleEmpty);
        
        hmPeople.remove("Debra", 34);
        for(String peopleName : hmPeople.keySet()) {
			
			System.out.println(peopleName + " "+ hmPeople.get(peopleName));
		}
	}

}
