package com.zph.zg.dao;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.model.Msg;
import com.zph.zg.param.MsgParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MsgDao extends CrudDao<Msg, MsgParam> {
    List<Msg> getBy(String phone);
    List<Msg> findAll();
}
