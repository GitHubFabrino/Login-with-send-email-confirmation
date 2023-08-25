package com.example.applicationEmail.service;

import com.example.applicationEmail.domain.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}
