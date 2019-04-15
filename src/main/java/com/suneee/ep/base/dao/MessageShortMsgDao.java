package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.MessageShortMsg;

public interface MessageShortMsgDao {
    int deleteByPrimaryKey(String flowno);

    int insert(MessageShortMsg record);

    int insertSelective(MessageShortMsg record);

    MessageShortMsg selectByPrimaryKey(String flowno);

    int updateByPrimaryKeySelective(MessageShortMsg record);

    int updateByPrimaryKey(MessageShortMsg record);
}