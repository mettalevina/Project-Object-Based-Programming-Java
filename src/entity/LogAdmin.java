package com.example.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "logadmin")
public class LogAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")  // Nama kolom sesuai dengan penamaan camelCase di database
    private Integer adminId;

    @Column(name = "admin_user")  // Nama kolom sesuai dengan penamaan camelCase di database
    private String adminUser;

    @Column(name = "admin_pass")  // Nama kolom sesuai dengan penamaan camelCase di database
    private String adminPass;

    // Getter dan Setter
    public Integer getadminId() {
        return adminId;
    }

    public void setadminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getadminUser() {
        return adminUser;
    }

    public void setadminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getadminPass() {
        return adminPass;
    }

    public void setadminPass(String adminPass) {
        this.adminPass = adminPass;
    }
}
