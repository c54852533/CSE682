package com.su.cse682.service.account;

import lombok.Data;

/**
 *
 *  @author yirong.wang
 */
@Data
public class AccountDTO {
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
