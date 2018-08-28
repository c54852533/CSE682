package com.su.cse682.tool.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *  @author yirong.wang
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String errorMessage;

    public BusinessException(ErrorConstantEnum errorConstantEnum, String errorMessage) {
        this.errorCode = errorConstantEnum.name();
        this.errorMessage = errorMessage;
    }

    public BusinessException(ErrorConstantEnum errorConstantEnum){
        this.errorCode = errorConstantEnum.name();
        this.errorMessage = errorConstantEnum.getMessage();
    }
}

