package com.su.cse682.domain.repository;

import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;

import java.util.List;

/**
 *
 *  @author yirong.wang
 */
public interface UserAuthRepository {
    /**
     * loadUserAuth
     * @param userAuthId
     * @return
     */
    UserAuth loadUserAuth (String userAuthId);

    /**
     * saveUserAuth
     * @param userAuth
     */
    int saveUserAuth (UserAuth userAuth);

    /**
     * queryUserAuth
     * @param userAuthQueryParam
     * @return
     */
    List<UserAuth> queryUserAuth (UserAuthQueryParam userAuthQueryParam);
}
