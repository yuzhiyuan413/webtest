package com.example.webtest.dao;

import com.example.webtest.bean.MapperBean;

public interface BaseRepository<T extends MapperBean> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}


