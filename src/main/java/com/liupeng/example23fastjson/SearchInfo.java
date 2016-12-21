package com.liupeng.example23fastjson;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * Created by zhangyinhu on 2016/7/5.
 */
public class SearchInfo {

    @JSONField(name="operator")
    private int operator;
    @JSONField(name="operatorLabel")
    private String operatorLabel;
    @JSONField(name="value1")
    private String value1;
    @JSONField(name="value2")
    private String value2;
    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String getOperatorLabel() {
        return operatorLabel;
    }

    public void setOperatorLabel(String operatorLabel) {
        this.operatorLabel = operatorLabel;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}
