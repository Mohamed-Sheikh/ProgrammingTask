/*****************************************************************************/
/*                            userInput 		                             */
/*****************************************************************************/
package com.bbc;

import java.util.Arrays;
import java.util.Scanner;

public class userInput {


	private Scanner input = new Scanner(System.in);
	

	public void data() {
		

		System.out.println("How many URL's Do you want to che");

		int numberOfUrls = input.nextInt();
		
		String[] URLs = new String[numberOfUrls];
		
		for (int i = 0; i < numberOfUrls; i++) {
			System.out.println("enter url " + (1 + i));
			URLs[i] = (input.next());

		}

		System.out.println(URLs);
	}
	
	public static void main (String[] args) {
		userInput ui = new userInput();
		ui.data();
	}
}