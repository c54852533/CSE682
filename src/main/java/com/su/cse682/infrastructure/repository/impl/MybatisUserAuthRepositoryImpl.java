package com.su.cse682.infrastructure.repository.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.repository.UserAuthRepository;
import com.su.cse682.infrastructure.persistent.user.UserAuthDo;
import com.su.cse682.infrastructure.persistent.user.UserAuthDoExample;
import com.su.cse682.infrastructure.persistent.user.dao.UserAuthDoMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  UserAuthRepository Interface Implement
 *  @author yirong.wang
 */
@Component
public class MybatisUserAuthRepositoryImpl implements UserAuthRepository {

    @Resource
    private Mapper mapper;

    @Resource
    private UserAuthDoMapper userAuthDoMapper;

    @Override
    public UserAuth loadUserAuth(String userAuthUUId) {
        UserAuthDo userAuthDOResult = userAuthDoMapper.selectByPrimaryKey(userAuthUUId);
        UserAuth userAuth = doToModel(userAuthDOResult);

        return userAuth;
    }

    @Override
    public int saveUserAuth(UserAuth userAuth) {
        UserAuthDo userAuthDO = modelToDO(userAuth);
        return userAuthDoMapper.insert(userAuthDO);
    }

    @Override
    public List<UserAuth> queryUserAuth(UserAuthQueryParam userAuthQueryParam) {
        UserAuthDoExample userAuthDoExample = new UserAuthDoExample();
        UserAuthDoExample.Criteria criteria = userAuthDoExample.createCriteria();

        if (!StringUtils.isEmpty(userAuthQueryParam.getUuid())){
            criteria.andUuidEqualTo(userAuthQueryParam.getUuid());
        }
        if (!StringUtils.isEmpty(userAuthQueryParam.getUserId())){
            criteria.andUserIdEqualTo(userAuthQueryParam.getUserId());
        }
        if (!StringUtils.isEmpty(userAuthQueryParam.getIdentityType().name())){
            criteria.andIdentityTypeEqualTo(userAuthQueryParam.getIdentityType().name());
        }
        if (!StringUtils.isEmpty(userAuthQueryParam.getIdentifier())){
            criteria.andIdentifierEqualTo(userAuthQueryParam.getIdentifier());
        }
        PageHelper.startPage(userAuthQueryParam.getPage(), userAuthQueryParam.getPageSize());
        return userAuthDoMapper.selectByExample(userAuthDoExample).stream().
                map(userAuthDO -> doToModel(userAuthDO)).
                collect(Collectors.toList());
    }

    private UserAuthDo modelToDO(UserAuth userAuth) {
        UserAuthDo userAuthDO = mapper.map(userAuth, UserAuthDo.class);

        userAuthDO.setGmtCreate(new Date());
        userAuthDO.setGmtModified(new Date());
        userAuthDO.setIdentityType(userAuth.getIdentityType().name());
        return userAuthDO;
    }

    private UserAuth doToModel(UserAuthDo userAuthDO) {
        UserAuth userAuth = mapper.map(userAuthDO, UserAuth.class);
        userAuth.setIdentityType(IdentityType.valueOf(userAuthDO.getIdentityType()));
        return userAuth;
    }
}
