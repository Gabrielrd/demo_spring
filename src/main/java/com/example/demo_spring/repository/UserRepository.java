package com.example.demo_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}