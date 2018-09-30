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

	public ArrayList<Integer> bonus = new ArrayList<Integer>();

	private static JSONArray JSONArray = new JSONArray();

	public void dataStream(ArrayList<String> domains) {

		for (int i = 0; i < domains.size(); i++) {

			JSONObject JSON = new JSONObject();

			try {
				URL url = new URL(domains.get(i));
				try {
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					/*
					 * "The program should cope gracefully when it makes a request to a slow or
					 * non-responsive web server"
					 */

					con.setReadTimeout(15000);
					con.setConnectTimeout(15000);

					try {
						JSON.put("Url", url);
						JSON.put("status Code", con.getResponseCode());

						JSON.put("content_length", con.getContentLength());
						JSON.put("date", new Date(con.getDate()));
						JSONArray.put(JSON);

					} catch (JSONException jse) {
						jse.printStackTrace();
						System.err.print("problem with JSON Object");
					}
				} catch (IOException ioe) {

					System.err.println("URL doesn't exist");
					try {
						JSON.put("url", "bad://address");
						JSON.put("Error", "invalid url");
						JSONArray.put(JSON);
					} catch (JSONException jse) {
						jse.printStackTrace();
						System.err.print("problem with error JSON Object");
					}
				}

				/*
				 * The program should identify and report invalid URLs, e.g. those that don't
				 * start with http:// or https://, or contain characters not allowed in a URL
				 */

			} catch (MalformedURLException mue) {
				System.err.println("Invalid URL");
				try {
					JSON.put("url", "bad://address");
					JSON.put("Error", "invalid url");
					JSONArray.put(JSON);
				} catch (JSONException jse) {
					jse.printStackTrace();
					System.err.print("problem with error JSON Object");
				}

			}

		}

	}

	public JSONArray getJsonDoc() {

		return JSONArray;
	}

}
