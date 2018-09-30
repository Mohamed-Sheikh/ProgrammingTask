package com.bbc;
import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import java.util.ArrayList;


public class dataPopulate {
	private static JSONArray JSONArray = new JSONArray();
	
	public void dataStream() {
	
	/* 
	 * for loop used to populate URL field
	 * 
	 */
	for(int i = 0; i < userInput.URLs.size(); i++) {
		JSONObject JSON = new JSONObject();
	try {
		
			
	URL url = new URL(userInput.URLs.get(i));
	try {
		
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		/*
		 * "The program should cope gracefully 
		 * when it makes a request to a slow or 
		 * non-responsive web server"
		 */
		connection.setReadTimeout(15000);
		connection.setConnectTimeout(15000);
		try {
		JSON.put("Url", url);
		JSON.put("status Code", connection.getResponseCode());
		
		JSON.put("content_length", connection.getContentLength());
		JSON.put("date", new Date(connection.getDate()));
		JSONArray.put(JSON);
		} catch (JSONException jse) {
			jse.printStackTrace();
			System.err.print("problem with JSON Object");
		}
	
	}catch(IOException ioe) {
		ioe.printStackTrace();
	}
	}catch(MalformedURLException mue) {
		mue.printStackTrace();
	
	}
	}
	
	}

}
