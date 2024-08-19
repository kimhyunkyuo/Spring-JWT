package com.example.jwttest.repository;

import com.example.jwttest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
