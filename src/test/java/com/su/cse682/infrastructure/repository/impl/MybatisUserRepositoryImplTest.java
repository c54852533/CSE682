package com.su.cse682.infrastructure.repository.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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

//    @Test
//    public void saveUser() {
//        User user = new User();
//        user.setUuid();
//    }
//
//    @Test
//    public void queryUser() {
//    }
}