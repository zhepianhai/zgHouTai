package com.zph.zg.base.dao;

import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CrudDao<T, P> extends BaseDao {
    T get(String var1);

    T getBy(P var1);

    List<T> findList(P var1);

    List<T> findPage(P var1);

    PageInfo<T> findPageInfo(P var1);

    int insert(T var1);

    int update(T var1);

    int delete(String var1);

    int deleteInFlag(String var1);

    int deleteBy(P var1);
}

