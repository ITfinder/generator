package com.suneee.ep.base.dao;

import com.suneee.ep.base.model.WmsMallItem;
import com.suneee.ep.base.model.WmsMallItemKey;

public interface WmsMallItemMapper {
    int deleteByPrimaryKey(WmsMallItemKey key);

    int insert(WmsMallItem record);

    int insertSelective(WmsMallItem record);

    WmsMallItem selectByPrimaryKey(WmsMallItemKey key);

    int updateByPrimaryKeySelective(WmsMallItem record);

    int updateByPrimaryKey(WmsMallItem record);
}