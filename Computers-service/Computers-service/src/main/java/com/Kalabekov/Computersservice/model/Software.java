package com.Kalabekov.Computersservice.model;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @ToString @Getter
@Entity
@Table(name = "software")
public class Software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "software_name")
    private String softwareName;

    @Column(name = "software_version")
    private String softwareVersion;

    @Column(name = "is_licensed")
    private boolean isLicensed;

    @Column(name = "computer_id")
    private int computerId;

    @ManyToOne
    @JoinColumn(name = "computer_id")
    private Computer computer;

    @ManyToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;
}
