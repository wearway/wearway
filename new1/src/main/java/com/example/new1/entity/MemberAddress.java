package com.example.new1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MemberAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @ManyToOne @JoinColumn(name = "member_id")
    private Customer customer;
    private String name;
    private String zipcode;
    private String address;
    private String addressDetail;
    private String tel;
    private String request;
    private boolean isDefault;
}
