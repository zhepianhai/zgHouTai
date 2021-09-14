package com.zph.zg.service.impl;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.base.service.AbstractCrudService;
import com.zph.zg.dao.TrackedDao;
import com.zph.zg.model.Tracked;
import com.zph.zg.param.TrackedParam;
import com.zph.zg.service.TrackedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TrackedServiceImpl extends AbstractCrudService<Tracked, TrackedParam> implements TrackedService {
    @Autowired
    private TrackedDao dao;
    public TrackedServiceImpl(TrackedDao dao) {
        super(dao);
        this.dao=dao;
    }

    @Override
    public List<Tracked> getBy(String phone) {
        return dao.getBy(phone);
    }
}
