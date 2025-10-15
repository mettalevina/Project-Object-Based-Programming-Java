package com.example.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lognasabah")
public class LogNasabah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nasabah_Id")  // Nama kolom sesuai dengan penamaan camelCase di database
    private Integer nasabahId;

    @Column(name = "nasabah_user")  // Nama kolom sesuai dengan penamaan camelCase di database
    private String nasabahUser;

    @Column(name = "nasabah_pass")  // Nama kolom sesuai dengan penamaan camelCase di database
    private String nasabahPass;

    // Getter dan Setter
    public Integer getNasabahId() {
        return nasabahId;
    }

    public void setNasabahId(Integer nasabahId) {
        this.nasabahId = nasabahId;
    }

    public String getNasabahUser() {
        return nasabahUser;
    }

    public void setNasabahUser(String nasabahUser) {
        this.nasabahUser = nasabahUser;
    }

    public String getNasabahPass() {
        return nasabahPass;
    }

    public void setNasabahPass(String nasabahPass) {
        this.nasabahPass = nasabahPass;
    }
}
