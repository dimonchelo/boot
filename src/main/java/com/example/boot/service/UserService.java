package com.example.boot.service;

import com.example.boot.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {
    void add(User user);
    List<User> listUser();
    User show(int id);
    @Transactional
    void delete(User user);
    @Transactional
    void update(User user);
}
