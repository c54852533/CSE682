package com.su.cse682.infrastructure.repository.impl;

import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.domain.repository.UserRepository;
import com.su.cse682.infrastructure.persistent.user.UserDo;
import com.su.cse682.infrastructure.persistent.user.dao.UserDoMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *  @author yirong.wang
 */
@Repository
public class MybatisUserRepositoryImpl implements UserRepository {

    @Resource
    private Mapper mapper;

    @Resource
    private UserDoMapper userDoMapper;

    @Override
    public User loadUser(String userUUID) {
        UserDo userDoCondition = UserDo.QueryBuild().uuid(userUUID);
        UserDo userDoResult = userDoMapper.queryUserDoLimit1(userDoCondition);
        User user = doToModel(userDoResult);
        return user;
    }

    @Override
    public int saveUser(User user) {
        UserDo userDO = modelToDO(user);
        return userDoMapper.insertUserDo(userDO);
    }

    @Override
    public List<User> queryUser (UserQueryParam userQueryParam) {

        UserDo queryUserDO = mapper.map(userQueryParam, UserDo.class);

        return userDoMapper.queryUserDo(queryUserDO).stream().
                map(userDO -> doToModel(userDO)).
                collect(Collectors.toList());
    }

    private UserDo modelToDO(User user) {
        UserDo userDO = mapper.map(user, UserDo.class);
        userDO.setGmtCreate(LocalDateTime.now());
        userDO.setGmtModified(LocalDateTime.now());
        return userDO;
    }


    private User doToModel(UserDo userDO) {
        User user = mapper.map(userDO, User.class);
        return user;
    }
}
