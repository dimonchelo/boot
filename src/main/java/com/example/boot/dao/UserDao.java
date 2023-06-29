package com.example.boot.dao;


import com.example.boot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> listUsers();
    User show(int id);

}
