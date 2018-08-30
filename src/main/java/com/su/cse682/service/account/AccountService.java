package com.su.cse682.service.account;

import com.su.cse682.tool.result.ResultModel;

/**
 *
 *  @author yirong.wang
 */
public interface AccountService {

    /**
     * User verify
     * for registered user login
     * @param accountDTO
     * @return
     */
    ResultModel<AccountDTO> verify(AccountDTO accountDTO);

    /**
     * User register
     * for appending a new user
     * @param accountDTO
     * @return
     */
    ResultModel<AccountDTO> registerByUsername(AccountDTO accountDTO);
}
