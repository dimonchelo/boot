package com.example.boot.service;

import com.example.boot.dao.UserDao;
import com.example.boot.model.User;
import com.example.boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User show(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Transactional
    @Override
    public void update(User user, int id) {
        user.setId(id);
        userRepository.save(user);
    }
}
