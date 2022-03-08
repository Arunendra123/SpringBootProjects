package com.example.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
