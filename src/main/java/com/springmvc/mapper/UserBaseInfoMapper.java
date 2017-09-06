package com.springmvc.mapper;

import com.springmvc.model.UserBaseInfo;
import com.springmvc.model.UserBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserBaseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    long countByExample(UserBaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int deleteByExample(UserBaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int deleteByPrimaryKey(String userBaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int insert(UserBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int insertSelective(UserBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    List<UserBaseInfo> selectByExampleWithRowbounds(UserBaseInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    List<UserBaseInfo> selectByExample(UserBaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    UserBaseInfo selectByPrimaryKey(String userBaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int updateByExample(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int updateByPrimaryKeySelective(UserBaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_base_info
     *
     * @mbg.generated Wed Sep 06 10:23:36 CST 2017
     */
    int updateByPrimaryKey(UserBaseInfo record);
}