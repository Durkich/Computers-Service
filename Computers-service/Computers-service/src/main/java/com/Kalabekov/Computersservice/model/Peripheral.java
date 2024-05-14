package com.Kalabekov.Computersservice.model;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @ToString @Getter
@Entity
@Table(name = "peripherals")
public class Peripheral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "peripheral_name")
    private String peripheralName;

    @Column(name = "peripheral_type")
    private String PeripheralType;

    @ManyToOne
    @JoinColumn(name = "computer_id")
    private Computer computer;

    @ManyToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;
}
