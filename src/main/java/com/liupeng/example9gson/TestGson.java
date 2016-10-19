package com.liupeng.example9gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

public class TestGson{

    public static void main(String[] args){

        String sync_es_type_list = "{\"CustomerTrade\",\"SaleGoal\"}";
        String sync_es_mapping_list = "{\"type1\":{\"properties\":{\"f1\":{\"type\":\"string\"}}},\"type2\":{\"properties\":{\"f1\":{\"type\":\"string\"}}}}";
        String type = "type2";

        //Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Gson gson = new Gson();
        //get object from json
        Map infoMap = gson.fromJson(sync_es_mapping_list, new TypeToken<Map<String, Object>>(){}.getType());
        Object properties = infoMap.get(type);
        System.out.println(properties);
        System.out.println("-----------------");

        Map<String,Object> typeMapping = new HashMap<String, Object>();
        typeMapping.put(type,infoMap.get(type));
        //get json from object
        String typeMappingJson = gson.toJson(typeMapping);
        System.out.println(typeMappingJson);
    }
}
