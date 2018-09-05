package com.su.cse682.service.account.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.service.account.dto.AuthenticationDTO;
import com.su.cse682.service.account.AccountService;
import com.su.cse682.tool.result.ResultModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Cse682Application.class)
public class AccountServiceImplTest {

    @Resource
    private AccountService accountService;

    @Test
    public void verify() {
        AuthenticationDTO authenticationDTO = new AuthenticationDTO();
        authenticationDTO.setIdentityType(IdentityType.USERNAME.name());
        authenticationDTO.setIdentifier("AccountServiceUsername" + LocalDate.now());
        authenticationDTO.setCredential("AccountServicePassword" + LocalDate.now());

        ResultModel rm = accountService.verify(authenticationDTO);
        assertTrue(rm.isSuccess());
    }

    @Test
    public void registerByUsername() {
        AuthenticationDTO authenticationDTO = new AuthenticationDTO();
        authenticationDTO.setIdentityType(IdentityType.USERNAME.name());
        authenticationDTO.setIdentifier("AccountServiceUsername" + LocalDate.now());
        authenticationDTO.setCredential("AccountServicePassword" + LocalDate.now());

        ResultModel rm = accountService.registerByUsername(authenticationDTO);
        assertTrue(rm.isSuccess());
    }
}