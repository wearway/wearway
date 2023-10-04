package com.example.new1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pw;
    private String tel;
    @Column(name = "EMAIL")
    private String eMail;
    private String jumin;
    private String gender;
    private boolean isBanned;
    private boolean isSignout;
}