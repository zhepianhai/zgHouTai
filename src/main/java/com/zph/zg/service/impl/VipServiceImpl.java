package com.zph.zg.service.impl;

import com.zph.zg.base.service.AbstractCrudService;
import com.zph.zg.dao.VipDao;
import com.zph.zg.model.Vip;
import com.zph.zg.param.VipParam;
import com.zph.zg.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class VipServiceImpl  extends AbstractCrudService<Vip, VipParam> implements VipService {
    @Autowired
    VipDao vipDao;

    public VipServiceImpl( VipDao  dao) {
        super(dao);
        this.vipDao=dao;
    }

    @Override
    public Vip getBy(String phone) {
        return vipDao.getBy(phone);
    }
}
