package com.bbc;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;


public class OutputWriter {
	
	public void fileWrites(JSONArray json) {
		
	dataPopulate dp = new dataPopulate();
	try {
		
	

		FileWriter fw = new FileWriter("Output.json");
		try {
		fw.write(dp.getJsonDoc().toString(1));
		fw.flush();
		fw.close();
		
		
		
		}catch(JSONException jse) {
			jse.printStackTrace();
		}
		
}catch(IOException ioe) {
	ioe.printStackTrace();
	
}
	System.out.println("check output file named 'Output.json'");
	}

}
