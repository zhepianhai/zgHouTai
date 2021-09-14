package com.zph.zg.service;

import com.zph.zg.base.service.CrudService;
import com.zph.zg.model.Tracked;
import com.zph.zg.param.TrackedParam;

import java.util.List;

public interface TrackedService  extends CrudService<Tracked, TrackedParam> {
    List<Tracked> getBy(String phone);
}
