package com.su.cse682.domain.repository;

import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.query.UserQueryParam;

import java.util.List;

/**
 *  User Repository
 *  @author yirong.wang
 */
public interface UserRepository {

    User loadUser (String userUUID);

    int saveUser (User user);

    List<User> queryUser (UserQueryParam userQueryParam);

    long countUser (UserQueryParam userQueryParam);
}
