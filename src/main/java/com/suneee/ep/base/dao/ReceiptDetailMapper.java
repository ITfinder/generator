package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ReceiptDetail;

public interface ReceiptDetailMapper {
    int deleteByPrimaryKey(Short recordId);

    int insert(ReceiptDetail record);

    int insertSelective(ReceiptDetail record);

    ReceiptDetail selectByPrimaryKey(Short recordId);

    int updateByPrimaryKeySelective(ReceiptDetail record);

    int updateByPrimaryKey(ReceiptDetail record);
}