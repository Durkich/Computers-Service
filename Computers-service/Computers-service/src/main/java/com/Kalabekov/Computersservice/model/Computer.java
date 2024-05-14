package com.Kalabekov.Computersservice.model;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@ToString
@Getter
@Entity
@Table(name = "computers")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "inventory_number")
    private String inventoryNumber;

    @Column(name = "graphic_adapter")
    private String graphicAdapter;

    @Column(name = "processor")
    private String processor;

    @Column(name = "rom")
    private Integer ROM;

    @Column(name = "ram")
    private Integer RAM;

    @OneToMany(mappedBy = "computer", cascade = CascadeType.ALL)
    private List<Peripheral> peripherals = new ArrayList<>();

    @OneToMany(mappedBy = "computer", cascade = CascadeType.ALL)
    private List<Software> software = new ArrayList<>();
    
}

