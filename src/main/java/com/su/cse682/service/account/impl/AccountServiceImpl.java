package com.su.cse682.service.account.impl;

import com.google.common.base.Preconditions;
import com.su.cse682.domain.manager.user.UserManager;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.service.account.AccountDTO;
import com.su.cse682.service.account.AccountService;
import com.su.cse682.tool.exception.BusinessException;
import com.su.cse682.tool.result.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.EnumUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

import static com.su.cse682.tool.exception.ErrorConstantEnum.PARAM_ERROR;

/**
 *
 *  @author yirong.wang
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private Mapper mapper;

    @Resource
    private UserManager userManager;

    @Override
    public ResultModel<AccountDTO> verify(AccountDTO accountDTO) {
        ResultModel rm = new ResultModel();
        try {
            checkAccountDTO(accountDTO);
            if (!isUserAuthExisted(accountDTO)){
                String errorMessage = "AccountServiceImpl.verifyUser: User Auth Info verified fail!";
                log.error(errorMessage);
                throw new BusinessException(PARAM_ERROR, errorMessage);
            }

            rm.setModel(accountDTO);
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
    public ResultModel<AccountDTO> registerByUsername(AccountDTO accountDTO) {
        ResultModel rm = new ResultModel();
        try {
            checkAccountDTO(accountDTO);
            if (isUsernameExisted(accountDTO.getIdentifier())){
                log.error("AccountServiceImpl.registerUser: Username already exist!");
                throw new BusinessException(PARAM_ERROR);
            }

            User user = new User();
            user.setUuid(UUID.randomUUID().toString().replace("-", ""));
            user.setName(accountDTO.getIdentifier());
            userManager.addUser(user);

            UserAuth userAuth = mapper.map(accountDTO, UserAuth.class);
            userAuth.setUuid(UUID.randomUUID().toString().replace("-", ""));
            userAuth.setUserId(user.getUuid());
            userManager.addUserAuth(userAuth);

            rm.setModel(accountDTO);
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

    private void checkAccountDTO(AccountDTO accountDTO) {
        Preconditions.checkNotNull(accountDTO.getIdentityType());
        if (!EnumUtils.isValidEnum(IdentityType.class, accountDTO.getIdentityType())){
            throw new IllegalArgumentException();
        }
        Preconditions.checkNotNull(accountDTO.getIdentifier());
        Preconditions.checkNotNull(accountDTO.getCredential());
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

    private boolean isUserAuthExisted(AccountDTO accountDTO){
        UserAuthQueryParam userAuthQueryParam = mapper.map(accountDTO, UserAuthQueryParam.class);
        userAuthQueryParam.setIdentityType(IdentityType.valueOf(accountDTO.getIdentityType()));
        List<UserAuth> userAuthList = userManager.queryUserAuth(userAuthQueryParam);
        if (CollectionUtils.isEmpty(userAuthList)){
            return false;
        }
        else {
            return true;
        }
    }
}
