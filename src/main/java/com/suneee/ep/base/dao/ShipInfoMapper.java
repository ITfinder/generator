package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ShipInfo;

public interface ShipInfoMapper {
    int deleteByPrimaryKey(String oid);

    int insert(ShipInfo record);

    int insertSelective(ShipInfo record);

    ShipInfo selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(ShipInfo record);

    int updateByPrimaryKey(ShipInfo record);
}