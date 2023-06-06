package com.example.jdbc.repository;


import com.example.jdbc.model.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();
    void create(User user);
    void delete(int id);
    void update(User user);
    User getUserById(int id);

    void insertUserStore(User user);
}