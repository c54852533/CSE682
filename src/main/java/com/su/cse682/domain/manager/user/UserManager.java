package com.su.cse682.domain.manager.user;

import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;

import java.util.List;

/**
 *
 *  @author yirong.wang
 */
public interface UserManager {

    User getUser(String userId);

    int addUser(User user);

    List<User> queryUser(UserQueryParam userQueryParam);

    UserAuth getUserAuth(String userAuthId);

    int addUserAuth(UserAuth userAuth);

    List<UserAuth> queryUserAuth(UserAuthQueryParam userAuthQueryParam);

}
