package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailBody;

public interface MailBodyDao {
    int deleteByPrimaryKey(Short mailId);

    int insert(MailBody record);

    int insertSelective(MailBody record);

    MailBody selectByPrimaryKey(Short mailId);

    int updateByPrimaryKeySelective(MailBody record);

    int updateByPrimaryKeyWithBLOBs(MailBody record);

    int updateByPrimaryKey(MailBody record);
}