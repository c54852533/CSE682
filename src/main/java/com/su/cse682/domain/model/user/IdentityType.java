package com.su.cse682.domain.model.user;

/**
 *  AuthType (aka login type) type
 *  @author yirong.wang
 */
public enum IdentityType {

    /**
     * USERNAME
     */
    USERNAME("USERNAME"),

    /**
     * MOBILEPHONE
     */
    MOBILEPHONE("MOBILEPHONE"),

    /**
     * EMAIL
     */
    EMAIL("EMAIL");

    public String type;

    public void setType(String type) {
        this.type = type;
    }

    IdentityType(String type) {
        this.type = type;
    }
}
