package com.java.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot_backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
