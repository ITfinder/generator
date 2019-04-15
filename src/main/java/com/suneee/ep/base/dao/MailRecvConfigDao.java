package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailRecvConfig;

public interface MailRecvConfigDao {
    int deleteByPrimaryKey(Short cfgId);

    int insert(MailRecvConfig record);

    int insertSelective(MailRecvConfig record);

    MailRecvConfig selectByPrimaryKey(Short cfgId);

    int updateByPrimaryKeySelective(MailRecvConfig record);

    int updateByPrimaryKey(MailRecvConfig record);
}