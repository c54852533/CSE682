package com.su.cse682.infrastructure.persistent.user.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.su.cse682.infrastructure.persistent.user.UserDo;
/**
*  @author yirong.wang
*/
public interface UserDoBaseMapper {

    int insertUserDo(UserDo object);

    int updateUserDo(UserDo object);

    int update(UserDo.UpdateBuilder object);

    List<UserDo> queryUserDo(UserDo object);

    UserDo queryUserDoLimit1(UserDo object);

}