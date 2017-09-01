package com.springmvc.dao;

import com.springmvc.domain.UserBaseInfo;

public interface UserBaseInfoMapper {
    int deleteByPrimaryKey(String userBaseId);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(String userBaseId);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}