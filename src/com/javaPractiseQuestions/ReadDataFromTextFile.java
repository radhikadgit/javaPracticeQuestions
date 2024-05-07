package com.javaPractiseQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
	//	C:\Users\radhi\Documents
		
		FileReader fr = new FileReader("C:\\Users\\radhi\\Documents\\Selenium_data_read_practice\\Test.txt");
		BufferedReader br=new BufferedReader(fr);
		
		//read data from text file using while loop
		String str;
		while((str=br.readLine()) != null){
			
			System.out.println(str);
			
		}
         br.close();
	}

}
