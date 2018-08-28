package com.su.cse682.tool.result;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *  @author yirong.wang
 */
@Data
public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private T model;

    private String errorMessage;

    private String errorCode;
}
