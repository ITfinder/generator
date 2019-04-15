package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ShTask;

public interface ShTaskMapper {
    int deleteByPrimaryKey(Short id);

    int insert(ShTask record);

    int insertSelective(ShTask record);

    ShTask selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(ShTask record);

    int updateByPrimaryKey(ShTask record);
}