package com.Kalabekov.Computersservice.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "laptops",schema = "infrastructure")
public class Laptop {
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

    @Column(name = "display")
    private String display;

    @JsonManagedReference
    @OneToMany(mappedBy = "laptop", cascade = CascadeType.ALL)
    private List<Peripheral> peripherals = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "laptop", cascade = CascadeType.ALL)
    private List<Software> software = new ArrayList<>();
}