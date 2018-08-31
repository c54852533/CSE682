package com.su.cse682.infrastructure.repository.impl;

import com.github.pagehelper.PageHelper;
import com.su.cse682.domain.model.user.User;
import com.su.cse682.domain.model.user.query.UserQueryParam;
import com.su.cse682.domain.repository.UserRepository;
import com.su.cse682.infrastructure.persistent.user.UserDo;
import com.su.cse682.infrastructure.persistent.user.UserDoExample;
import com.su.cse682.infrastructure.persistent.user.dao.UserDoMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  UserRepository Interface Implement
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
        UserDo userDoResult = userDoMapper.selectByPrimaryKey(userUUID);
        User user = doToModel(userDoResult);
        return user;
    }

    @Override
    public int saveUser(User user) {
        UserDo userDO = modelToDO(user);
        return userDoMapper.insert(userDO);
    }

    @Override
    public List<User> queryUser (UserQueryParam userQueryParam) {

        UserDoExample userDoExample = new UserDoExample();
        UserDoExample.Criteria criteria = userDoExample.createCriteria();

        if (!StringUtils.isEmpty(userQueryParam.getUuid())){
            criteria.andUuidEqualTo(userQueryParam.getUuid());
        }
        if (!StringUtils.isEmpty(userQueryParam.getName())){
            criteria.andNameEqualTo(userQueryParam.getName());
        }

        if (userQueryParam.getCreateTimeUpperLimit() != null){
            criteria.andGmtCreateLessThanOrEqualTo(userQueryParam.getCreateTimeUpperLimit());
        }
        if (userQueryParam.getCreateTimeLowerLimit() != null){
            criteria.andGmtCreateGreaterThanOrEqualTo(userQueryParam.getCreateTimeLowerLimit());
        }

        PageHelper.startPage(userQueryParam.getPage(), userQueryParam.getPageSize());
        return userDoMapper.selectByExample(userDoExample).stream().
                map(userDO -> doToModel(userDO)).
                collect(Collectors.toList());
    }

    private UserDo modelToDO(User user) {
        UserDo userDO = mapper.map(user, UserDo.class);
        userDO.setGmtCreate(new Date());
        userDO.setGmtModified(new Date());
        return userDO;
    }


    private User doToModel(UserDo userDO) {
        User user = mapper.map(userDO, User.class);
        return user;
    }
}
