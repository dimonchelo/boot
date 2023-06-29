package com.example.boot.service;

import com.example.boot.dao.UserDao;
import com.example.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> listUser() {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public User show(int id) {
        return userDao.show(id);
    }
    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
