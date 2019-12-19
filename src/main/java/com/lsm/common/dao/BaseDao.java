package com.lsm.common.dao;


import java.util.HashMap;

public interface BaseDao {
    Integer save(Object object);

    Integer remove(Object object);

    Integer update(Object object);

    HashMap get(Object object);
}
