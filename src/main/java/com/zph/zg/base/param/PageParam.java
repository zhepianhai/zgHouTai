package com.zph.zg.base.param;


public class PageParam extends BaseParam {
    private int pageNum = 1;
    private int pageSize = 10;
    private String orderBy;
    private boolean count = false;
    private String offset;

    public PageParam() {
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public boolean getCount() {
        return this.count;
    }

    public void setCount(boolean containPageInfo) {
        this.count = this.count;
    }

    public String getOffset() {
        return this.offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}

