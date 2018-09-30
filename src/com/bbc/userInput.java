/*****************************************************************************/
/*                            userInput 		                             */
/*****************************************************************************/
package com.bbc;

import java.util.ArrayList;
import java.util.Scanner;

public class userInput {


	private Scanner input = new Scanner(System.in);
	
	public int numberOfUrls;
	public static ArrayList<String> URLs = new ArrayList<String>();
	
	public void data() {
		

		System.out.println("How many URL's Do you want to add");

		 numberOfUrls = input.nextInt();
		
		
		
		for (int i = 0; i < numberOfUrls; i++) {
			System.out.println("enter url " + (1 + i));
			URLs.add(input.next());

		}

		System.out.println(URLs);
	}
	public int getNumberChoice() {
		
		return numberOfUrls;
	}
	
	public static void main (String[] args) {
		userInput ui = new userInput();
		ui.data();
	}
}