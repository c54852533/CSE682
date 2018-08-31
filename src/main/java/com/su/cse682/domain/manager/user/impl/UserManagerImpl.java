package com.su.cse682.domain.manager.user.impl;

import com.google.common.base.Preconditions;
import com.su.cse682.domain.manager.user.UserManager;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.domain.repository.UserAuthRepository;
import com.su.cse682.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 *  UserManager Interface Implement
 *  @author yirong.wang
 */
@Component
public class UserManagerImpl implements UserManager {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserAuthRepository userAuthRepository;

    @Override
    public User getUser(String userId) {
        Preconditions.checkNotNull(userId);
        User user = userRepository.loadUser(userId);
        Preconditions.checkNotNull(user);
        return user;
    }

    @Override
    public int addUser(User user) {
        Preconditions.checkNotNull(user.getUuid(), user.getName());
        return userRepository.saveUser(user);
    }

    @Override
    public List<User> queryUser(UserQueryParam userQueryParam) {
        return userRepository.queryUser(userQueryParam);
    }

    @Override
    public UserAuth getUserAuth(String userAuthId) {
        Preconditions.checkNotNull(userAuthId);
        UserAuth userAuth = userAuthRepository.loadUserAuth(userAuthId);
        Preconditions.checkNotNull(userAuth);
        return userAuth;
    }

    @Override
    public int addUserAuth(UserAuth userAuth) {
        Preconditions.checkNotNull(userAuth);
        return userAuthRepository.saveUserAuth(userAuth);
    }

    @Override
    public List<UserAuth> queryUserAuth(UserAuthQueryParam userAuthQueryParam) {
        return userAuthRepository.queryUserAuth(userAuthQueryParam);
    }
}
