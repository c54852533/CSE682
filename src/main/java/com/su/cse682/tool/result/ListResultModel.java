package com.su.cse682.tool.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 *  Facade pattern tool
 *  For results as list
 *  @author yirong.wang
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ListResultModel<T> extends ResultModel<List<T>>{

    /**
     * Num of all results that match the query
     */
    private Long totalCount;

    /**
     * Num of results in the current page.
     */
    private Long count;
}
