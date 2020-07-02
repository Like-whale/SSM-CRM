package com.qyh.dao;

import com.qyh.pojo.BaseDict;

import java.util.List;

public interface DictMapper {

    public List<BaseDict> findDictByCode(String code);

}
