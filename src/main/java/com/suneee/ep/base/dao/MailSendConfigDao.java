package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailSendConfig;

public interface MailSendConfigDao {
    int deleteByPrimaryKey(Short cfgId);

    int insert(MailSendConfig record);

    int insertSelective(MailSendConfig record);

    MailSendConfig selectByPrimaryKey(Short cfgId);

    int updateByPrimaryKeySelective(MailSendConfig record);

    int updateByPrimaryKey(MailSendConfig record);
}