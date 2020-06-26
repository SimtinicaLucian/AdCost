package com.example.adcost.Service;

import com.example.adcost.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}