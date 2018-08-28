package com.su.cse682.tool.exception;

/**
 *
 *  @author yirong.wang
 */
public enum ErrorConstantEnum {

    /**
     * PARAM_ERROR
     */
    PARAM_ERROR("PARAM_ERROR"),

    /**
     * PARAM_EMPTY
     */
    PARAM_EMPTY("PARAM_EMPTY");

    private String message;

    ErrorConstantEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
