package com.su.cse682.service.account.impl;

import com.su.cse682.Cse682Application;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.service.account.AccountDTO;
import com.su.cse682.service.account.AccountService;
import com.su.cse682.tool.result.ResultModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Cse682Application.class)
public class AccountServiceImplTest {

    @Resource
    private AccountService accountService;

    @Test
    public void verify() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setIdentityType(IdentityType.USERNAME.name());
        accountDTO.setIdentifier("AccountServiceUnitTestUsername");
        accountDTO.setCredential("AccountServiceUnitTestPassword");

        ResultModel rm = accountService.verify(accountDTO);
        assertTrue(rm.isSuccess());
    }

    @Test
    public void registerByUsername() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setIdentityType(IdentityType.USERNAME.name());
        accountDTO.setIdentifier("AccountServiceUnitTestUsername1");
        accountDTO.setCredential("AccountServiceUnitTestPassword");

        ResultModel rm = accountService.registerByUsername(accountDTO);
        assertTrue(rm.isSuccess());
    }
}