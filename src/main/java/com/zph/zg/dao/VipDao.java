package com.zph.zg.dao;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.model.Vip;
import com.zph.zg.param.VipParam;
import org.springframework.stereotype.Repository;

@Repository
public interface VipDao extends CrudDao<Vip, VipParam> {
    Vip getBy(String phone);
}
