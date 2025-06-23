package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;
    @Column(name = "FULL NAME", nullable = false, updatable = true)
    private String name;
    @Column(name = "AGE", updatable = true)
    private int age;
    @Column(name = "Salary", nullable = false)
    private float salary;

    @JoinColumn(name = "Restaurant ID")
    @ManyToOne
    private Restaurant restaurant;

}
