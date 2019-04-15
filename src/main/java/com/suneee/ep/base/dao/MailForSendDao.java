package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailForSend;

public interface MailForSendDao {
    int deleteByPrimaryKey(Short mailId);

    int insert(MailForSend record);

    int insertSelective(MailForSend record);

    MailForSend selectByPrimaryKey(Short mailId);

    int updateByPrimaryKeySelective(MailForSend record);

    int updateByPrimaryKey(MailForSend record);
}