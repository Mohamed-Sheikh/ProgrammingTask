package com.bbc;

import java.util.ArrayList;
import java.util.Scanner;

public class userInput {

	//add do while for invalid characters - give option to escape
	
	public int noOfUrl;
	private Scanner input = new Scanner(System.in);
	public static ArrayList<String> sites = new ArrayList<String>();

	public void data() {

		System.out.println("how many URL's do you have?");

		noOfUrl = input.nextInt();

		for (int i = 0; i < noOfUrl; i++) {
			System.out.println("enter url " + (1 + i));
			sites.add(input.next());

		}

		
	}
	

	public ArrayList<String> getUserInput() {

		return sites;

	}

}