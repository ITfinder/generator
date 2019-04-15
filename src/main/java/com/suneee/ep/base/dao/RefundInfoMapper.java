package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.RefundInfo;

public interface RefundInfoMapper {
    int deleteByPrimaryKey(String refundId);

    int insert(RefundInfo record);

    int insertSelective(RefundInfo record);

    RefundInfo selectByPrimaryKey(String refundId);

    int updateByPrimaryKeySelective(RefundInfo record);

    int updateByPrimaryKey(RefundInfo record);
}