package com.bbc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class dataPopulate {
	
	
	public void dataStream() {
	
	/* 
	 * for loop used to populate URL field
	 * 
	 */
	for(int i = 0; i < userInput.URLs.size(); i++) {
	try {
	
			
	URL url = new URL(userInput.URLs.get(i));
	try {
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	
	//This will go into a json object
	System.out.println("response code = " + connection.getResponseCode());
	System.out.println("content length =" + connection.getContentLength());
	System.out.println("date =" + connection.getDate());
	}catch(IOException ioe) {
		ioe.printStackTrace();
	}
	}catch(MalformedURLException mue) {
		mue.printStackTrace();
	
	}
	}
	
	}

}
