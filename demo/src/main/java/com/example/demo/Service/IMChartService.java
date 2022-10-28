package com.example.demo.Service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ChartDao;
import com.example.demo.Dao.MemberDao;
import com.example.demo.Vo.MarketCode;
import com.example.demo.common.common;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service("Chart")
public class IMChartService implements ChartService{

	@Resource
	private ChartDao Dao;
	
	@Override
	public void setMarketCode() {
		OkHttpClient client = new OkHttpClient();
		List<MarketCode> list = new ArrayList<MarketCode>();
		 try {
        Request request = new Request.Builder()
            .url("https://api.upbit.com/v1/market/all?isDetails=false")
            .get()
            .addHeader("accept", "application/json")
            .build();

    		
			Response response = client.newCall(request).execute();
			JSONArray JsonList = new JSONArray(response.body().string());
			for(int i =0; i<JsonList.length(); i++) {
			Gson gson = new Gson();
			list.add(gson.fromJson(JsonList.getJSONObject(i).toString(),MarketCode.class));
			}
			Dao.setMarketCode(list);
			
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return ;


	    }

	
}
