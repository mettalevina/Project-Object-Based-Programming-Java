package com.example.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringboot.entity.LogNasabah;

import java.util.List;
import java.util.Optional;

public interface LogNasabahRepository extends JpaRepository<LogNasabah, Integer> {
    Optional<LogNasabah> findByNasabahUser(String nasabahUser);  // Fetch LogNasabah by username
    List<LogNasabah> findAll(); // Ambil semua data nasabah
}