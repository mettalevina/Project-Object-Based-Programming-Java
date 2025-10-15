package com.example.demospringboot.service;

import com.example.demospringboot.entity.LogAdmin;
import com.example.demospringboot.repository.LogAdminRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogAdminService {

    private final LogAdminRepository logAdminRepository;

    public LogAdminService(LogAdminRepository logAdminRepository) {
        this.logAdminRepository = logAdminRepository;
    }

    // public boolean login(String adminUser, String adminPass) {
    //     Optional<LogAdmin> logAdminOptional = logAdminRepository.findByAdminUser(adminUser);
    //     return logAdminOptional.isPresent() && 
    //            logAdminOptional.get().getadminPass().equals(adminPass);
    // }

    public boolean login(String adminUser, String adminPass) {
        // Cari username di database
        Optional<LogAdmin> logAdminOptional = logAdminRepository.findByAdminUser(adminUser);

        // Jika username ada, periksa password
        if (logAdminOptional.isPresent()) {
            LogAdmin admin = logAdminOptional.get();
            return admin.getadminPass().equals(adminPass); // Bandingkan password
        }

        // Jika username tidak ditemukan, login gagal
        return false;
    }

    // Tambahkan method ini untuk digunakan di controller
    public Optional<LogAdmin> findByAdminUser(String adminUser) {
        return logAdminRepository.findByAdminUser(adminUser);
    }

}
