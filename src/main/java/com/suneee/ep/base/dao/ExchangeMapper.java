package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.Exchange;

public interface ExchangeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Exchange record);

    int insertSelective(Exchange record);

    Exchange selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Exchange record);

    int updateByPrimaryKey(Exchange record);
}