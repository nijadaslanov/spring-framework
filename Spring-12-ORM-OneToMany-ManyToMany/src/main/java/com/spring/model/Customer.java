package com.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String userName;
    private String name;
    private String surName;
    private String email;
    private String address;


    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Customer(String userName, String name, String surName, String email) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }
}
