package com.Kalabekov.Computersservice.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter @ToString @Getter
public class Computer {
    private int id;
    private String description;
    private String computerId;
    private String purchaseDate;
    private Float price;

}
