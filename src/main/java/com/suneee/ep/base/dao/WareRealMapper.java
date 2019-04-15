package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.WareReal;

public interface WareRealMapper {
    int deleteByPrimaryKey(Short wareId);

    int insert(WareReal record);

    int insertSelective(WareReal record);

    WareReal selectByPrimaryKey(Short wareId);

    int updateByPrimaryKeySelective(WareReal record);

    int updateByPrimaryKey(WareReal record);
}