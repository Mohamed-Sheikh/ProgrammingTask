package com.bbc;


public class main {
	
	
	public static void main (String[] args) {
		
		userInput user = new userInput();
		user.data();
		dataPopulate dp = new dataPopulate();
		dp.dataStream(user.getUserInput());
	}

}
