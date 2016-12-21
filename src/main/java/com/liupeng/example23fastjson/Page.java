package com.liupeng.example23fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Description:
 * Created by lvhw on 2016/9/1 19:31.
 */

public class Page {
    @JSONField(name = "pageSize")
    private int pageSize;
    @JSONField(name = "pageNumber")
    private int pageNumber;
    @JSONField(name = "pageCount")
    private int pageCount;
    @JSONField(name = "totalCount")
    private int totalCount;

    public Page() {
    }

    public Page(int pageSize, int pageNumber, int pageCount, int totalCount) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.pageCount = pageCount;
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
