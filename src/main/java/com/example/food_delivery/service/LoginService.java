package com.example.food_delivery.service;

import org.springframework.stereotype.Service;


public interface LoginService {

    boolean checkLogin(String email, String password);
}
