package com.example.food_delivery.repository;

import com.example.food_delivery.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public List<UserEntity> findByEmailAndPassword(String email, String password);
}
