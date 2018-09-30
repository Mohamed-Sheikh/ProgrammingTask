package com.bbc;

import java.util.ArrayList;
import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdditionalTask {

	public static int count;

	public static JSONArray JArray = new JSONArray();

	public void SortData(ArrayList<Integer> responseCodes) {

		TreeSet<Integer> sortedList = new TreeSet<Integer>(responseCodes);

		ArrayList<Integer> sortedTree = new ArrayList<Integer>(sortedList);

		for (int i = 0; i < sortedTree.size(); i++) {
			for (int j = 0; j < responseCodes.size(); j++) {

				if (sortedTree.get(i).equals(responseCodes.get(j))) {

					count++;

				}

				if (j == responseCodes.size() - 1) {

					JSONObject JObject = new JSONObject();

					try {

						JObject.put("number of responses", count);
						JObject.put("status_code", sortedTree.get(i));
						JArray.put(JObject);

					} catch (JSONException jse) {

					}

					count = 0;
				}
			}

		}

	}
}
