package com.su.cse682.service.account.dto;

import lombok.Data;

/**
 *  AuthenticationDTO
 *  @author yirong.wang
 */
@Data
public class AuthenticationDTO {
    /**
     * IdentityType
     */
    private String identityType;

    /**
     * identifier
     */
    private String identifier;

    /**
     * credential - md5
     */
    private String credential;
}
