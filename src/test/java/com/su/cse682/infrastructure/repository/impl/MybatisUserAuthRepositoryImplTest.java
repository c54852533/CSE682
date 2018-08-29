package com.su.cse682.infrastructure.repository.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.domain.repository.UserAuthRepository;
import com.su.cse682.domain.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import javax.validation.constraints.Digits;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Cse682Application.class)
public class MybatisUserAuthRepositoryImplTest {

    private static final String UNITTEST_UUID = UUID.randomUUID().toString().replace("-", "");

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserAuthRepository userAuthRepository;

    @Test
    public void loadUserAuth() {
        UserAuth userAuth = userAuthRepository.loadUserAuth(UNITTEST_UUID);
        assertNotNull(userAuth);
    }

    @Test
    public void saveUserAuth() {
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setName("UserRepositoryTestUsername");
        User user = userRepository.queryUser(userQueryParam).get(0);

        UserAuth userAuth = new UserAuth();
        userAuth.setUuid(UNITTEST_UUID);
        userAuth.setUserId(user.getUuid());
        userAuth.setIdentityType(IdentityType.USERNAME);
        userAuth.setIdentifier(user.getName());
        userAuth.setCredential(DigestUtils.md5DigestAsHex(user.getName().getBytes()));

        int result = userAuthRepository.saveUserAuth(userAuth);
        assertNotNull(result);
    }

    @Test
    public void queryUserAuth() {
        UserAuthQueryParam userAuthQueryParam = new UserAuthQueryParam();
        userAuthQueryParam.setIdentityType(IdentityType.USERNAME);

        List<UserAuth> userAuthList = userAuthRepository.queryUserAuth(userAuthQueryParam);

        assertNotNull(userAuthList);
    }
}