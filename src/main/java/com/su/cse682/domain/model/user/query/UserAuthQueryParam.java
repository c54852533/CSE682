package com.su.cse682.domain.model.user.query;

import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.tool.query.PageQueryParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.util.DigestUtils;

/**
 *
 *  @author yirong.wang
 */

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserAuthQueryParam extends PageQueryParam {
    /**
     * user_auth id, auto increment from 0
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
