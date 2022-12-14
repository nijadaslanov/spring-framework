package com.spring.entity;

import com.spring.Gender;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "studentFirstName")
    private String firstName; //first_name

    @Column(name = "studentLastName")
    private String lastName;

    private String email;

    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;

    @Column(columnDefinition = "TIME")
    private LocalTime birthtime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
