package com.su.cse682.infrastructure.repository.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.domain.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Cse682Application.class)
public class MybatisUserRepositoryImplTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void loadUser() {
        String uuid = "e6b874cfc1ce48ba8f266fc6415b7049";
        User user = userRepository.loadUser(uuid);

        assertNotNull(user);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUuid(UUID.randomUUID().toString().replace("-", ""));
        user.setName("noMultiModuleUsername");

        int result = userRepository.saveUser(user);
        assertNotNull(result);
    }

    @Test
    public void queryUser() {
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setName("noMultiModuleUsername");

        List<User> userList = userRepository.queryUser(userQueryParam);

        assertNotNull(userList);
    }
}