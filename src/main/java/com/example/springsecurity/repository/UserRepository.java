package com.example.springsecurity.repository;

import com.example.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor {
    User findUserByEmail(String email);
}
