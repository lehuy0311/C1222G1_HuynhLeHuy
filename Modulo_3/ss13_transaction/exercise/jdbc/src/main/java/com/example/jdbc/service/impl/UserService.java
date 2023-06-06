package com.example.jdbc.service.impl;

import com.example.jdbc.model.User;
import com.example.jdbc.repository.IUserRepository;
import com.example.jdbc.repository.impl.UserRepository;
import com.example.jdbc.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private static IUserRepository iUserRepository = new UserRepository();

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void create(User user) {
        iUserRepository.create(user);
    }

    @Override
    public void delete(int id) {
        iUserRepository.delete(id);
    }

    @Override
    public void update(User user) {
        iUserRepository.update(user);
    }

    @Override
    public User getUserById(int id) {
        return iUserRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) {
        iUserRepository.insertUserStore(user);
    }
}
