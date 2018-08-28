package com.su.cse682.domain.model.user;

import lombok.Data;
import org.springframework.util.DigestUtils;

/**
 *
 *  @author yirong.wang
 */

@Data
public class UserAuth {

    /**
     * user_uuid
     */
    private String uuid;

    /**
     * one user_id to 1many user_auth
     */
    private String userId;

    /**
     * IdentityType
     */
    private IdentityType identityType;

    /**
     * identifier
     */
    private String identifier;

    /**
     * credential
     */
    private String credential;

    public void setCredential(String credential) {
        this.credential = DigestUtils.md5DigestAsHex(credential.getBytes());
    }
}
