package com.zph.zg.service;

import com.zph.zg.base.service.CrudService;
import com.zph.zg.model.User;
import com.zph.zg.param.UserParam;

import java.util.List;

public interface UserService  extends CrudService<User, UserParam> {
    List<User> findAll();
    User login(User user);
}
