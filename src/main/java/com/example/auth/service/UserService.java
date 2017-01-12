package com.example.auth.service;

import com.example.auth.model.User;

/**
 * Created by sartika.s.hasibuan on 1/11/2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
