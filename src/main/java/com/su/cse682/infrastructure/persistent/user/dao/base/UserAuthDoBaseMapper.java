package com.su.cse682.infrastructure.persistent.user.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.su.cse682.infrastructure.persistent.user.UserAuthDo;
/**
*  @author yirong.wang
*/
public interface UserAuthDoBaseMapper {

    int insertUserAuthDo(UserAuthDo object);

    int updateUserAuthDo(UserAuthDo object);

    int update(UserAuthDo.UpdateBuilder object);

    List<UserAuthDo> queryUserAuthDo(UserAuthDo object);

    UserAuthDo queryUserAuthDoLimit1(UserAuthDo object);

}