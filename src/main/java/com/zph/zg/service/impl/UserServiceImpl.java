package com.zph.zg.service.impl;

import com.zph.zg.base.dao.CrudDao;
import com.zph.zg.base.service.AbstractCrudService;
import com.zph.zg.dao.UserDao;
import com.zph.zg.model.User;
import com.zph.zg.param.UserParam;
import com.zph.zg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends AbstractCrudService<User, UserParam> implements UserService {
    @Autowired
    private UserDao userDao;
    public UserServiceImpl(UserDao dao) {
        super(dao);
        this.userDao=dao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
