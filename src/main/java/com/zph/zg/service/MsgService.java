package com.zph.zg.service;

import com.zph.zg.base.service.CrudService;
import com.zph.zg.model.Msg;
import com.zph.zg.param.MsgParam;

import java.util.List;

public interface MsgService  extends CrudService<Msg, MsgParam> {
    List<Msg> getBy(String phone);
}
