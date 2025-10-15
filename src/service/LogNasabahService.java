package com.example.demospringboot.service;

import com.example.demospringboot.entity.LogNasabah;
import com.example.demospringboot.repository.LogNasabahRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class LogNasabahService {

    private final LogNasabahRepository logNasabahRepository;

    public LogNasabahService(LogNasabahRepository logNasabahRepository) {
        this.logNasabahRepository = logNasabahRepository;
    }

    // public boolean login(String nasabahUser, String nasabahPass) {
    //     Optional<LogNasabah> logNasabahOptional = logNasabahRepository.findByNasabahUser(nasabahUser);
    //     return logNasabahOptional.isPresent() && 
    //            logNasabahOptional.get().getNasabahPass().equals(nasabahPass);
    // }

    public boolean login(String nasabahUser, String nasabahPass) {
        // Cari username di database
        Optional<LogNasabah> logNasabahOptional = logNasabahRepository.findByNasabahUser(nasabahUser);

        // Jika username ada, periksa password
        if (logNasabahOptional.isPresent()) {
            LogNasabah nasabah = logNasabahOptional.get();
            return nasabah.getNasabahPass().equals(nasabahPass); // Bandingkan password
        }

        // Jika username tidak ditemukan, login gagal
        return false;
    }

    // TAMBAHAN

    public List<LogNasabah> getAllNasabah() {
    List<LogNasabah> nasabahList = logNasabahRepository.findAll();
    System.out.println("Data dari database: " + nasabahList);
    // return logNasabahRepository.findAll();
    return nasabahList;
}

    // Tambahkan method ini untuk digunakan di controller
    public Optional<LogNasabah> findByNasabahUser(String nasabahUser) {
        return logNasabahRepository.findByNasabahUser(nasabahUser);
    }
    
    public void deleteNasabah(Integer nasabahId) {
        // Menghapus data nasabah berdasarkan ID
        logNasabahRepository.deleteById(nasabahId);
    }  
}

