package com.su.cse682.domain.manager.user.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.manager.user.UserManager;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;
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
public class UserManagerImplTest {

    @Resource
    private UserManager userManager;

    @Test
    public void getUser() {
        User user = userManager.getUser("e6b874cfc1ce48ba8f266fc6415b7049");
        assertNotNull(user);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUuid(UUID.randomUUID().toString().replace("-", ""));
        user.setName("UserManagerAddTestUsername");

        int result = userManager.addUser(user);
        assertNotNull(result);
    }

    @Test
    public void queryUser() {
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setName("UserManagerAddTestUsername");

        List<User> userList = userManager.queryUser(userQueryParam);

        assertNotNull(userList);
    }

    @Test
    public void getUserAuth() {
        UserAuth userAuth = userManager.getUserAuth("a79dc51224674ae080a1f78b4c279490");
        assertNotNull(userAuth);
    }

    @Test
    public void addUserAuth() {
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setName("UserManagerAddTestUsername");

        List<User> userList = userManager.queryUser(userQueryParam);

        User user = userList.get(0);
        UserAuth userAuth = new UserAuth();
        userAuth.setUuid(UUID.randomUUID().toString().replace("-", ""));
        userAuth.setUserId(user.getUuid());

        userAuth.setIdentityType(IdentityType.USERNAME);
        userAuth.setIdentifier(user.getName());
        userAuth.setCredential(DigestUtils.md5DigestAsHex(user.getName().getBytes()));

        assertNotNull(userManager.addUserAuth(userAuth));
    }

    @Test
    public void queryUserAuth() {
        UserAuthQueryParam userAuthQueryParam = new UserAuthQueryParam();
        userAuthQueryParam.setIdentityType(IdentityType.USERNAME);

        List<UserAuth> userAuthList = userManager.queryUserAuth(userAuthQueryParam);
        assertNotNull(userAuthList);
    }
}