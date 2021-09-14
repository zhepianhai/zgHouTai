package com.zph.zg.dao;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.model.User;
import com.zph.zg.param.UserParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudDao<User, UserParam> {
    List<User> findAll();
    User login(User user);
 }
