package com.su.cse682.infrastructure.repository.impl;

import com.su.cse682.domain.model.user.IdentityType;
import com.su.cse682.domain.model.user.UserAuth;
import com.su.cse682.domain.model.user.query.UserAuthQueryParam;
import com.su.cse682.domain.repository.UserAuthRepository;
import com.su.cse682.infrastructure.persistent.user.UserAuthDo;
import com.su.cse682.infrastructure.persistent.user.dao.UserAuthDoMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *  @author yirong.wang
 */
@Component
public class MybatisUserAuthRepositoryImpl implements UserAuthRepository {

    @Resource
    private Mapper mapper;

    @Resource
    private UserAuthDoMapper userAuthDoMapper;

    @Override
    public UserAuth loadUserAuth(String userAuthId) {
        UserAuthDo userAuthDoCondition = UserAuthDo.QueryBuild().uuid(userAuthId).build();
        UserAuthDo userAuthDOResult = userAuthDoMapper.queryUserAuthDoLimit1(userAuthDoCondition);
        UserAuth userAuth = doToModel(userAuthDOResult);

        return userAuth;
    }

    @Override
    public int saveUserAuth(UserAuth userAuth) {
        UserAuthDo userAuthDO = modelToDO(userAuth);
        return userAuthDoMapper.insertUserAuthDo(userAuthDO);
    }

    @Override
    public List<UserAuth> queryUserAuth(UserAuthQueryParam userAuthQueryParam) {
        UserAuthDo userAuthDoCondition = mapper.map(userAuthQueryParam, UserAuthDo.class);
        return userAuthDoMapper.queryUserAuthDo(userAuthDoCondition).stream().
                map(userAuthDO -> doToModel(userAuthDO)).
                collect(Collectors.toList());
    }

    private UserAuthDo modelToDO(UserAuth userAuth) {
        UserAuthDo userAuthDO = mapper.map(userAuth, UserAuthDo.class);

        userAuthDO.setGmtCreate(LocalDateTime.now());
        userAuthDO.setGmtModified(LocalDateTime.now());
        userAuthDO.setIdentityType(userAuth.getIdentityType().name());
        return userAuthDO;
    }

    private UserAuth doToModel(UserAuthDo userAuthDO) {
        UserAuth userAuth = mapper.map(userAuthDO, UserAuth.class);

        userAuth.setIdentityType(IdentityType.valueOf(userAuthDO.getIdentityType()));
        return userAuth;
    }
}
