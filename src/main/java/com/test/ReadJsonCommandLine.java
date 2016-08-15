package com.test;

import org.json.JSONException;
import org.json.JSONObject;

public class ReadJsonCommandLine {
	
	public static void main(String[] args) throws JSONException {
		
		String jsonString =  args[0];
		
		//System.out.println(jsonString);
		JSONObject jObject  = new JSONObject(jsonString); 
		String data = jObject.getString("endpoint"); 
		System.out.println(data);
	}

}
