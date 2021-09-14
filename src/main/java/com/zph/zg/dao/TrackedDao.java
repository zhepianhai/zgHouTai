package com.zph.zg.dao;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.model.Tracked;
import com.zph.zg.param.TrackedParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackedDao extends CrudDao<Tracked, TrackedParam> {
    List<Tracked> getBy(String phone);
}
