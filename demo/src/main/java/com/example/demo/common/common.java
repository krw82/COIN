package com.example.demo.common;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.demo.Vo.MarketCode;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import okhttp3.Response;

public  class common {
	
	public static String gf_trim(String string) {
		if(string==null) {
			System.out.println(string);
			return "";
		}
		else {
			return string;
		}
	}
	


}
