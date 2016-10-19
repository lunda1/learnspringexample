package com.liupeng.example9gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class TestGson1 {
    public static void main(String[] args){
        String jsonStr = "{\"type1\":\"value1\",\"type2\":\"value2\"}";
        String type = "type2";
		Gson gson = new Gson();
		Map infoMap = gson.fromJson(jsonStr, new TypeToken<Map<String, String>>(){}.getType());
		System.out.println(infoMap);
		System.out.println(infoMap.get(type));
    }
}
