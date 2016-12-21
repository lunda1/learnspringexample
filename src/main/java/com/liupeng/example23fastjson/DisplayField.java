package com.liupeng.example23fastjson;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * 显示字段参数类
 * Created by liupeng on 2016/6/2.
 */

public class DisplayField implements Comparable<DisplayField> {

    @JSONField(name = "fieldID")
    private String fieldID;
    @JSONField(name = "seq")
    private int seq;
    @JSONField(name = "dbFieldName")
    private String dbFieldName;
    @JSONField(name = "dbObjName")
    private String dbObjName;
    @JSONField(name = "fieldName")
    private String fieldName;
    @JSONField(name = "isVisible")
    private int isVisible = 1;//默认值为1，前端不传的时候默认构造为显示
    @JSONField(name = "dataType")
    private String dataType;
    @JSONField(name = "columnName")//列名称
    private String columnName;
    @JSONField(name = "columnCaption")//列显示名称
    private String columnCaption;
    @JSONField(name = "orderType")
    private int orderType;
    @JSONField(name = "fieldType")
    private String fieldType;
    @JSONField(name = "fixed")
    private int fixed;
    @JSONField(name = "enumName")
    private String enumName;
    @JSONField(name = "groupSeq")
    private int groupSeq;
    @JSONField(name = "isGroup")
    private int isGroup;
    @JSONField(name = "operator")
    private int operator;
    @JSONField(name = "value1")
    private String value1;
    @JSONField(name = "value2")
    private String value2;
    @JSONField(name = "search")
    private SearchInfo search;
    @JSONField(name = "aggrType")
    private String aggrType = "0"; //默认为0，不聚合，使得返回前端的所有displayField中都有该属性

    @JSONField(name = "ref_obj_name")
    private String refObjName;

    @JSONField(name = "subFieldType")
    private String subFieldType;

    public String getRefObjName() {
        return refObjName;
    }

    public void setRefObjName(String refObjName) {
        this.refObjName = refObjName;
    }

    public String getAggrType() {
        return aggrType;
    }

    public void setAggrType(String aggrType) {
        this.aggrType = aggrType;
    }

    public SearchInfo getSearch() {
        return search;
    }

    public void setSearch(SearchInfo search) {
        this.search = search;
    }


    public int getGroupSeq() {
        return groupSeq;
    }

    public void setGroupSeq(int groupSeq) {
        this.groupSeq = groupSeq;
    }

    public int getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(int isGroup) {
//        if (groupSeq>0)
//            this.isGroup = 1;
//        else
//            this.isGroup=0;
        this.isGroup = isGroup;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnCaption() {
        return columnCaption;
    }

    public void setColumnCaption(String columnCaption) {
        this.columnCaption = columnCaption;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFieldID() {
        return fieldID;
    }

    public void setFieldID(String fieldID) {
        this.fieldID = fieldID;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDbFieldName() {
        return dbFieldName;
    }

    public void setDbFieldName(String dbFieldName) {
        this.dbFieldName = dbFieldName;
    }

    public String getDbObjName() {
        return dbObjName;
    }

    public void setDbObjName(String dbObjName) {
        this.dbObjName = dbObjName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(int isVisible) {
        this.isVisible = isVisible;
    }

    public String getSubFieldType() {
        return subFieldType;
    }

    public void setSubFieldType(String subFieldType) {
        this.subFieldType = subFieldType;
    }

    // Select语句拼接中的别名
    public String getAliasName() {
        return dbFieldName + fieldID;
    }

    public int compareTo(DisplayField o) {
        return this.groupSeq < o.groupSeq ? -1 : (this.groupSeq == o.groupSeq ? 0 : 1);
    }
}
