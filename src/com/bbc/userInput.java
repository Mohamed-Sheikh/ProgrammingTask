package com.bbc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userInput {

	
	
	public int noOfUrl;
	private Scanner input = new Scanner(System.in);
	public static ArrayList<String> sites = new ArrayList<String>();

	public void data() {
		

		System.out.println("how many URL's do you have?");
		
		try {
		noOfUrl = input.nextInt();
		}catch(InputMismatchException ime) {
		System.err.println("Please enter a valid number");	
		}

		for (int i = 0; i < noOfUrl; i++) {
			System.out.println("enter url " + (1 + i));
			sites.add(input.next());

		}

		
	}
	

	public ArrayList<String> getUserInput() {

		return sites;

	}

}