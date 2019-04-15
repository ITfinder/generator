package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.SystemConfig;

public interface SystemConfigDao {
    int deleteByPrimaryKey(String configItemKey);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(String configItemKey);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}