package com.liupeng.example9gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by piezi on 2016/3/20.
 */
public class TestNewJson {
    public static void main(String[] args){
        String sync_es_type_list = "{\"CustomerTrade\",\"SaleGoal\"}";
        String sync_es_mapping_list = "{\"type1\":\"value1\",\"type2\":\"value2\"}";
        String typeName = "type2";

        //Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Gson gson = new Gson();

        //the following example shows the structure the var syncESmappingList
        /**
        {
            "indextype": {
                 "properties": {
                    "country": {
                        "type": "string",
                        "index": "not_analyzed"
                    }
                 }
            },
            "indextype2": {
                 "properties": {
                    "country": {
                        "type": "string",
                        "index": "not_analyzed"
                    }
                 }
            }
        }
        **/
        FieldMapping fm = new FieldMapping();
        fm.setType("string");
        fm.setIndex("not_analyzed");

        Map<String,FieldMapping> fields = new HashMap<String,FieldMapping>();
        fields.put("country", fm);
        fields.put("city", fm);
        fields.put("province", fm);

        Map<String,Map<String,FieldMapping>> properties = new HashMap<String,Map<String,FieldMapping>>();
        properties.put("properties", fields);

        Map<String,Map<String,Map<String,FieldMapping>>> typeMapping = new HashMap<String,Map<String,Map<String,FieldMapping>>>();
        typeMapping.put("indextyp3", properties);

        String typeMappingJson = gson.toJson(typeMapping);

        System.out.println(typeMappingJson);
        System.out.println("---------------------------------------------------------------------------------");

        Map<String,Map<String,Map<String,FieldMapping>>> newType = gson.fromJson(typeMappingJson,new TypeToken<Map<String,Map<String,Map<String,FieldMapping>>>>(){}.getType());
        System.out.print(newType.get("indextyp3").get("properties").get("city").getIndex()+"----");
        System.out.println(newType.get("indextyp3").get("properties").get("city").getType());

//        Map infoMap = gson.fromJson(sync_es_mapping_list, new TypeToken<Map<String, String>>(){}.getType());
//        System.out.println(infoMap.get(type));
    }

}
