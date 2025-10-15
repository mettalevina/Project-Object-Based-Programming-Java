package com.example.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringboot.entity.LogAdmin;
import java.util.Optional;
import java.util.List;

public interface LogAdminRepository extends JpaRepository<LogAdmin, Integer> {
    Optional<LogAdmin> findByAdminUser(String adminUser);  // Fetch LogAdmin by username
    List<LogAdmin> findAll();
}
