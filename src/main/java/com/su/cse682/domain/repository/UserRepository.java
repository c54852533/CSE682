package com.su.cse682.domain.repository;

import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.query.UserQueryParam;

import java.util.List;

/**
 *
 *  @author yirong.wang
 */
public interface UserRepository {

    User loadUser (String userUUID);

    void saveUser (User user);

    List<User> queryUser (UserQueryParam userQueryParam);
}
