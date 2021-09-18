package com.zph.zg.service.impl;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.base.service.AbstractCrudService;
import com.zph.zg.dao.MsgDao;
import com.zph.zg.model.Msg;
import com.zph.zg.param.MsgParam;
import com.zph.zg.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MsgServiceImpl extends AbstractCrudService<Msg, MsgParam> implements MsgService {
    @Autowired
    MsgDao msgDao;
    public MsgServiceImpl(MsgDao dao) {
        super(dao);
        this.msgDao=dao;
    }

    @Override
    public List<Msg> getBy(String phone) {
        return msgDao.getBy(phone);
    }

    @Override
    public List<Msg> findAll() {
        return msgDao.findAll();
    }
}
