package com.su.cse682.infrastructure.persistent.user.dao;

import com.su.cse682.infrastructure.persistent.user.UserAuthDo;
import com.su.cse682.infrastructure.persistent.user.UserAuthDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    long countByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int deleteByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int insert(UserAuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int insertSelective(UserAuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    List<UserAuthDo> selectByExample(UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    UserAuthDo selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserAuthDo record, @Param("example") UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserAuthDo record, @Param("example") UserAuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserAuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAuthDo record);
}