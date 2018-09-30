package com.bbc;


public class main {
	
	
	public static void main (String[] args) {
		
		userInput user = new userInput();
		user.data();
		
		dataPopulate dp = new dataPopulate();
		dp.dataStream(user.getUserInput());
		
		OutputWriter output = new OutputWriter();
		output.fileWrites(dp.getJsonDoc());
		
		AdditionalTask at = new AdditionalTask();
		at.SortData(dp.bonus);
		
		output.AdditionalTaskFileWriter(AdditionalTask.JArray);
		
		
	}

}
