package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ReceiptInfo;

public interface ReceiptInfoMapper {
    int deleteByPrimaryKey(String rid);

    int insert(ReceiptInfo record);

    int insertSelective(ReceiptInfo record);

    ReceiptInfo selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(ReceiptInfo record);

    int updateByPrimaryKey(ReceiptInfo record);
}