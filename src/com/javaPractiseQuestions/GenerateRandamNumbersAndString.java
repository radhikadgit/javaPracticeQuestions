package com.javaPractiseQuestions;

import java.util.Random;

public class GenerateRandamNumbersAndString {
	
	static Random rand = new Random();
	
	public static long generateRandamNumbers() {
		
		//Random rand = new Random();
		long randomNumbers = rand.nextInt(10000);
		System.out.println(randomNumbers);
		return randomNumbers;
	}
	
	public static void mathRandomnumber() {
		System.out.println(Math.random());
	}
	
	public String generateRandomString() {
		
		int randomChar1 = 65+rand.nextInt(26);
		char randUpperChar = (char) randomChar1;
		
		int randChar2  = 90+rand.nextInt(26);
		char randLowerChar = (char) randChar2;
		
		String randomString = randUpperChar+""+randLowerChar;
		System.out.println(randomString);
		return randomString;
	}

	public static void main(String[] args) {
		
		// Static method we can call directly with class name
		generateRandamNumbers();
		
		// Instance method- we can call the method with using an object of the class
		GenerateRandamNumbersAndString grs = new GenerateRandamNumbersAndString();
		grs.generateRandomString();
		mathRandomnumber();
	}

}
