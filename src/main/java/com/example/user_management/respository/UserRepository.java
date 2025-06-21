package com.example.user_management.respository;

import com.example.user_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContainingIgnoreCase(String name);
    List<User> findByStatus(String status);
}