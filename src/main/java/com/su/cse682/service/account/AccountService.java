package com.su.cse682.service.account;

import com.su.cse682.service.account.dto.AuthenticationDTO;
import com.su.cse682.service.account.dto.LoginInfoDTO;
import com.su.cse682.tool.result.ResultModel;

/**
 *  AccountService
 *  @author yirong.wang
 */
public interface AccountService {

    /**
     * User verify
     * for registered user login
     * @param authenticationDTO
     * @return AuthenticationDTO
     */
    ResultModel<LoginInfoDTO> verify(AuthenticationDTO authenticationDTO);

    /**
     * User register
     * for appending a new user
     * @param authenticationDTO
     * @return AuthenticationDTO
     */
    ResultModel<LoginInfoDTO> registerByUsername(AuthenticationDTO authenticationDTO);
}
