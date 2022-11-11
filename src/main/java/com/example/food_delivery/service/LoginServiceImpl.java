package com.example.food_delivery.service;

import com.example.food_delivery.entity.UserEntity;
import com.example.food_delivery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean checkLogin(String email, String password) {
        List<UserEntity> users = userRepository.findByEmailAndPassword(email, password);
        return users.size()>0;
    }
}
