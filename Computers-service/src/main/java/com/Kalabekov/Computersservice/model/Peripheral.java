package com.Kalabekov.Computersservice.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @ToString @Getter
public class Peripheral {
    private int id;
    private String peripheralName;
    private String PeripheralType;
    private int computerId;
}
