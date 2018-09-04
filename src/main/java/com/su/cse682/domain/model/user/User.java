package com.su.cse682.domain.model.user;

import lombok.Data;

/**
 *  User
 *  @author yirong.wang
 */

@Data
public class User {

    /**
     * user_uuid
     */
    private String uuid;

    /**
     * user_name
     */
    private String name;
}