package com.example.evently.auth.config.repositories;

import com.example.evently.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String username);
    boolean existsByEmail(String email);
    Optional<User> findByUsername(String username);
}