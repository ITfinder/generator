package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MailBox;

public interface MailBoxDao {
    int deleteByPrimaryKey(String boxId);

    int insert(MailBox record);

    int insertSelective(MailBox record);

    MailBox selectByPrimaryKey(String boxId);

    int updateByPrimaryKeySelective(MailBox record);

    int updateByPrimaryKey(MailBox record);
}