package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ReceiptBack;

public interface ReceiptBackMapper {
    int deleteByPrimaryKey(Short recordId);

    int insert(ReceiptBack record);

    int insertSelective(ReceiptBack record);

    ReceiptBack selectByPrimaryKey(Short recordId);

    int updateByPrimaryKeySelective(ReceiptBack record);

    int updateByPrimaryKey(ReceiptBack record);
}