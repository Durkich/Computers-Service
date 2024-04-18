package com.Kalabekov.Computersservice.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@ToString
@Getter
public class Computer {
    private int id;
    private String inventoryNumber;
    private String graphicAdapter;
    private String processor;
    private String valueROm;
    private String valueRAM;
    private List<Peripheral> peripherals = new ArrayList<>();
    private List<Software> software = new ArrayList<>();


}

