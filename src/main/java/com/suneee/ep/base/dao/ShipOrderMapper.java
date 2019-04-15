package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.ShipOrder;

public interface ShipOrderMapper {
    int deleteByPrimaryKey(Short orderId);

    int insert(ShipOrder record);

    int insertSelective(ShipOrder record);

    ShipOrder selectByPrimaryKey(Short orderId);

    int updateByPrimaryKeySelective(ShipOrder record);

    int updateByPrimaryKey(ShipOrder record);
}