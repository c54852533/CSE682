package com.su.cse682.tool.query;

import lombok.Data;

/**
 *  Query super class with Page feature supported
 *  @author yirong.wang
 */
@Data
public class PageQueryParam {

    private static final long serialVersionUID = 1L;

    /**
     * Max 100 results in one page
     */
    private static final int MAX_PAGE_SIZE = 100;

    /**
     * Default 10 results in one page
     */
    private static final int DEFAULT_RESULT_COUNT = 10;

    /**
     * Default page num start from 1
     */
    private static final int DEFAULT_PAGE_NUM = 1;

    private int page = DEFAULT_PAGE_NUM;

    private int pageSize = DEFAULT_RESULT_COUNT;

    public int getStartNum() {
        adjustPageSize();
        if (page <= 0) {
            page = 1;
        }
        return (page - 1)* pageSize;
    }

    public int getEndNum() {
        return getStartNum() + pageSize -1;
    }

    private void adjustPageSize(){
        if (this.pageSize <=0 || this.pageSize> MAX_PAGE_SIZE){
            this.pageSize = DEFAULT_RESULT_COUNT;
        }
    }

}
