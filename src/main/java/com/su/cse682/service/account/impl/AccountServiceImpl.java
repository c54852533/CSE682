package com.su.cse682.service.account.impl;

import com.google.common.base.Preconditions;
import com.su.cse682.domain.manager.user.UserManager;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.service.account.dto.AuthenticationDTO;
import com.su.cse682.service.account.AccountService;
import com.su.cse682.service.account.dto.LoginInfoDTO;
import com.su.cse682.tool.exception.BusinessException;
import com.su.cse682.tool.result.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.EnumUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

import static com.su.cse682.tool.exception.ErrorConstantEnum.PARAM_ERROR;

/**
 *  AccountService Interface Implement
 *  @author yirong.wang
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {

    @Resource
    private Mapper mapper;

    @Resource
    private UserManager userManager;

    @Override
    public ResultModel<LoginInfoDTO> verify(AuthenticationDTO authenticationDTO) {
        ResultModel rm = new ResultModel();
        LoginInfoDTO loginInfoDTO = new LoginInfoDTO();
        try {
            checkAuthenticationDTO(authenticationDTO);
            UserAuth userAuth = mapper.map(authenticationDTO, UserAuth.class);
            User user = userManager.verifyUser(userAuth);
            if (user == null){
                String errorMessage = "AccountServiceImpl.verifyUser: User Auth Info verified fail!";
                log.error(errorMessage);
                throw new BusinessException(PARAM_ERROR, errorMessage);
            }
            loginInfoDTO.setUserId(user.getUuid());
            loginInfoDTO.setUserName(user.getName());
            rm.setModel(loginInfoDTO);
            rm.setSuccess(true);
        }
        catch (BusinessException ex) {
            rm.setSuccess(false);
            rm.setErrorCode(ex.getErrorCode());
            rm.setErrorMessage(ex.getErrorMessage());
        }
        catch (Exception ex) {
            rm.setSuccess(false);
            rm.setErrorMessage(ex.getMessage());
        }
        return rm;
    }

    @Override
    public ResultModel<LoginInfoDTO> registerByUsername(AuthenticationDTO authenticationDTO) {
        ResultModel rm = new ResultModel();
        LoginInfoDTO loginInfoDTO = new LoginInfoDTO();
        try {
            checkAuthenticationDTO(authenticationDTO);
            if (isUsernameExisted(authenticationDTO.getIdentifier())){
                String errorMessage = "AccountServiceImpl.registerUser: Username already exist!";
                log.error(errorMessage);
                throw new BusinessException(PARAM_ERROR, errorMessage);
            }

            User user = new User();
            user.setUuid(UUID.randomUUID().toString().replace("-", ""));
            user.setName(authenticationDTO.getIdentifier());
            userManager.addUser(user);

            UserAuth userAuth = mapper.map(authenticationDTO, UserAuth.class);
            userAuth.setUuid(UUID.randomUUID().toString().replace("-", ""));
            userAuth.setUserId(user.getUuid());
            userManager.addUserAuth(userAuth);

            loginInfoDTO.setUserId(user.getUuid());
            loginInfoDTO.setUserName(user.getName());
            rm.setModel(loginInfoDTO);
            rm.setSuccess(true);
        }
        catch (BusinessException ex) {
            rm.setSuccess(false);
            rm.setErrorCode(ex.getErrorCode());
            rm.setErrorMessage(ex.getErrorMessage());
        }
        catch (Exception ex) {
            rm.setSuccess(false);
            rm.setErrorMessage(ex.getMessage());
        }
        return rm;
    }

    private void checkAuthenticationDTO(AuthenticationDTO authenticationDTO) {
        Preconditions.checkNotNull(authenticationDTO.getIdentityType());
        if (!EnumUtils.isValidEnum(IdentityType.class, authenticationDTO.getIdentityType())){
            throw new IllegalArgumentException();
        }
        Preconditions.checkNotNull(authenticationDTO.getIdentifier());
        Preconditions.checkNotNull(authenticationDTO.getCredential());
    }

    private boolean isUsernameExisted(String username){
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setName(username);
        if (CollectionUtils.isEmpty(userManager.queryUser(userQueryParam))){
            return false;
        }
        else {
            return true;
        }
    }
}
