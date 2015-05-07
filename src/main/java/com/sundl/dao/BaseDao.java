package com.sundl.dao;

import java.util.List;

/**
 * Created by Sun on 2015/5/8.
 * <p/>
 * 该接口定义操作数据库的抽象方法，方法体由具体类去实现
 */
public interface BaseDao {
    public abstract void save(Object object);

    public abstract void update(Object object);

    public abstract Object find(Object object);

    public abstract List findByCondition(String condition);

    public abstract void deleteByCondition(String condition);

    public abstract void delete(Object object);


}
