package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ExchangeItem;

public interface ExchangeItemMapper {
    int deleteByPrimaryKey(Short id);

    int insert(ExchangeItem record);

    int insertSelective(ExchangeItem record);

    ExchangeItem selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(ExchangeItem record);

    int updateByPrimaryKey(ExchangeItem record);
}