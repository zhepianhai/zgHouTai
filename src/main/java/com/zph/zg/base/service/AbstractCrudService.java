package com.zph.zg.base.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zph.zg.base.dao.CrudDao;

import java.util.List;

public abstract class AbstractCrudService<T, P> implements CrudService<T, P> {
    private CrudDao<T, P> dao;

    public AbstractCrudService(CrudDao<T, P> dao) {
        this.dao = dao;
    }

    public T get(String key) {
        return this.dao.get(key);
    }

    public T getBy(P param) {
        return this.dao.getBy(param);
    }

    public List findList(P param) {
        return this.dao.findList(param);
    }

    public List<T> findPage(P param) {
        PageHelper.startPage(param);
        List<T> list = this.dao.findList(param);
        return list;
    }

    public PageInfo<T> findPageInfo(P param) {
        PageHelper.startPage(param);
        List<T> list = this.dao.findList(param);
        PageInfo<T> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public int insert(T entity) {
        return this.dao.insert(entity);
    }

    public int update(T entity) {
        return this.dao.update(entity);
    }

    public int delete(String key) {
        return this.dao.delete(key);
    }

    public int deleteInFlag(String key) {
        return this.dao.deleteInFlag(key);
    }

    public int deleteBy(P param) {
        return this.dao.deleteBy(param);
    }
}

