package com.Kalabekov.Computersservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @ToString @Getter
public class Software {
    private int id;
    private String softwareName;
    private String softwareVersion;
    private int computerId;
}
