package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.TradeRecord;

public interface TradeRecordMapper {
    int deleteByPrimaryKey(Short recordId);

    int insert(TradeRecord record);

    int insertSelective(TradeRecord record);

    TradeRecord selectByPrimaryKey(Short recordId);

    int updateByPrimaryKeySelective(TradeRecord record);

    int updateByPrimaryKey(TradeRecord record);
}