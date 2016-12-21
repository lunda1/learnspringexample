package com.liupeng.example23fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 返回值参数类
 * Created by liupeng on 2016/6/2.
 */
public class Status {
    @JSONField(name="statusCode")
    private int statusCode;

    @JSONField(name="statusPhrase")
    private String statusPhrase;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    public String getStatusPhrase() {
        return statusPhrase;
    }

    public void setStatusPhrase(String statusPhrase) {
        this.statusPhrase = statusPhrase;
    }
}
