package com.su.cse682.domain.model.user;

import lombok.Data;
import org.springframework.util.DigestUtils;

/**
 *  User Authentication Info
 *  @author yirong.wang
 */

@Data
public class UserAuth {

    /**
     * userAuth_uuid
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

    public UserAuth encrypt(){
        this.credential = DigestUtils.md5DigestAsHex(this.credential.getBytes());
        return this;
    }
}
