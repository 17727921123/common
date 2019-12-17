package com.lsm.common.dao;


import java.util.HashMap;

public interface BaseDao {
    Integer save(Object object);

    Integer remove(Object object);

    Integer update(Object object);

    HashMap query(Integer id, Class c);

    HashMap get(Object object);
}
