package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailMessageId;

public interface MailMessageIdDao {
    int deleteByPrimaryKey(String messgeId);

    int insert(MailMessageId record);

    int insertSelective(MailMessageId record);

    MailMessageId selectByPrimaryKey(String messgeId);

    int updateByPrimaryKeySelective(MailMessageId record);

    int updateByPrimaryKey(MailMessageId record);
}