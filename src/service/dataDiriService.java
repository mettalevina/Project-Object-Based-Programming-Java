package com.example.demospringboot.service;

import com.example.demospringboot.entity.dataDiri;
import com.example.demospringboot.repository.dataDiriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class dataDiriService {

    @Autowired
    private dataDiriRepository dataDiriRepository;

    // Menyimpan Data Diri
    public dataDiri saveDataDiri(dataDiri dataDiri) {
        return dataDiriRepository.save(dataDiri);
    }
    
    // Mencari Data Diri berdasarkan NIK
    public Optional<dataDiri> getDataDiriByNIK(String NIK) {
        return dataDiriRepository.findById(NIK);
    }

    // Menghapus Data Diri berdasarkan NIK
    public void deleteDataDiri(String NIK) {
        dataDiriRepository.deleteById(NIK);
    }  
}

