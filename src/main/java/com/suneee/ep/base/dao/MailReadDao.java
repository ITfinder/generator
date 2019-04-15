package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailRead;

public interface MailReadDao {
    int deleteByPrimaryKey(Short id);

    int insert(MailRead record);

    int insertSelective(MailRead record);

    MailRead selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(MailRead record);

    int updateByPrimaryKey(MailRead record);
}