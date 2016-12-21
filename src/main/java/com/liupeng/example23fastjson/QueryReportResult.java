package com.liupeng.example23fastjson;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Map;

/**
 * 查询报表数据后的返回结果
 * Created by lvhw on 2016/6/1.
 */
public class QueryReportResult {
    @JSONField(name = "dataSet")
    private List<Map<String,Cell>> dataSet;

    @JSONField(name = "displayFields")
    private List<DisplayField> displayFields;

    @JSONField(name = "status")
    private transient Status status;

    @JSONField(name = "page")
    private Page page;


    public List<Map<String,Cell>> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<Map<String,Cell>> dataSet) {
        this.dataSet = dataSet;
    }

    public List<DisplayField> getDisplayFields() {
        return displayFields;
    }

    public void setDisplayFields(List<DisplayField> displayFields) {
        this.displayFields = displayFields;
    }

    //@JSONField(serialize = false)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 分页信息
     */

}
