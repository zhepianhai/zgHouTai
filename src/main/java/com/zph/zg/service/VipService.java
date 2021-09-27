package com.zph.zg.service;

import com.zph.zg.base.service.CrudService;
import com.zph.zg.model.Vip;
import com.zph.zg.param.VipParam;

public interface VipService extends CrudService<Vip, VipParam> {
    Vip getBy(String phone);
}
