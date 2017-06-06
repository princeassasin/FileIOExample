package com.example.file.java;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) throws IOException {
		
		int data;
		char datareader;
		
		FileInputStream file = new FileInputStream("C:\\Users\\MRuser\\Desktop\\hello.txt");
		while((data =file.read()) !=-1){
			
			datareader = (char)data;
			System.out.print(datareader);
		}

	}

}
