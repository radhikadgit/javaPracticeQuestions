package com.javaPractiseQuestions;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// call the generateRandomString method with using class name
		RandomString.generateRandomString();

	}

	// create random string method
	public static String generateRandomString() {
		// create Random class object
		Random random = new Random();
		int num = random.nextInt(10);

		int alphUcNum = 65 + random.nextInt(26);
		char charUcase = (char) alphUcNum;

		int alphaLcNum = 90 + random.nextInt(26);
		char charLcase = (char) alphaLcNum;

		String randomString = charUcase + "" + charLcase + "" + num;
		System.out.println("Random String: "+randomString);
		return randomString;
	}

}
