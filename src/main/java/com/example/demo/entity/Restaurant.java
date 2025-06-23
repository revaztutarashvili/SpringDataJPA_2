package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Restaurant {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column (name = "Restaurant Name")
    private String name;
    @Column(name = "Cuisine Type")
    private String type;

    @JoinColumn (name = "Employee ID")
    @OneToMany
    private Employee employee;

}
