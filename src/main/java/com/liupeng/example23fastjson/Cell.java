package com.liupeng.example23fastjson;

/**
 * 单元格
 *
 * Created by huoqi on 16/8/30.
 */
public class Cell {

    private Object value;

    private String formattedValue;

    private String aggType;

    private String aggTypeCaption;

    public Cell() {
    }

    public Cell(Object value, String formattedValue) {
        this.value = value;
        this.formattedValue = formattedValue;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getFormattedValue() {
        return null == formattedValue ? (null == value ? null : value.toString()) : formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public String getAggType() {
        return aggType;
    }

    public void setAggType(String aggType) {
        this.aggType = aggType;
    }

    public String getAggTypeCaption() {
        return aggTypeCaption;
    }

    public void setAggTypeCaption(String aggTypeCaption) {
        this.aggTypeCaption = aggTypeCaption;
    }

    @Override
    public String toString() {
        return "value:" + value + ";formattedValue:" + formattedValue;
    }
}
