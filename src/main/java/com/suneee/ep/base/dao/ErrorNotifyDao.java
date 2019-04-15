package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ErrorNotify;

public interface ErrorNotifyDao {
    int deleteByPrimaryKey(Short errorId);

    int insert(ErrorNotify record);

    int insertSelective(ErrorNotify record);

    ErrorNotify selectByPrimaryKey(Short errorId);

    int updateByPrimaryKeySelective(ErrorNotify record);

    int updateByPrimaryKey(ErrorNotify record);
}