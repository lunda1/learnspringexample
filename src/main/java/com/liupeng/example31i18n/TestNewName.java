package com.liupeng.example31i18n;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liupeng on 2017/2/13.
 */
public class TestNewName {
    public static void main(String[] args) {
        System.out.println(getNewName("vn"));

    }

    public static String getNewName(String viewName){
        List<String> viewNames = new ArrayList<>();
        viewNames.add("vnSUFFIX");
        viewNames.add("vnSUFFIX1");
        viewNames.add("vnSUFFIX2");
        viewNames.add("vnSUFFIX3");
        viewNames.add("vnSUFFIX4");
        StringBuilder newName = new StringBuilder(viewName+"SUFFIX");
        int count = 1;
        while(true){
            if(viewNames.contains(newName.toString())){
                newName.replace(viewName.length(),newName.length(),"SUFFIX"+count);
                count++;
                continue;
            }
            break;
        }
        return newName.toString();
    }
}
