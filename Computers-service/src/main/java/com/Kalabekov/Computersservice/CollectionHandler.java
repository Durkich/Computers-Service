package com.Kalabekov.Computersservice;

import com.Kalabekov.Computersservice.model.Computer;
import com.Kalabekov.Computersservice.model.Peripheral;
import com.Kalabekov.Computersservice.model.Software;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CollectionHandler {

    @Autowired
    public CollectionHandler() {
        initializeTestData();
    }

    private List<Computer> computers = new ArrayList<>();
    private List<Peripheral> peripherals = new ArrayList<>();
    private List<Software> software = new ArrayList<>();


    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void addPeripheral(Peripheral peripheral) {
        peripherals.add(peripheral);
    }

    public void addSoftware(Software software) {
        this.software.add(software);
    }


    private void initializeTestData() {
        Computer computer1 = new Computer();
        computer1.setId(1);
        computer1.setInventoryNumber("38091");
        computer1.setGraphicAdapter("NVIDIA GeForce RTX 3080");
        computer1.setProcessor("Intel Core i9-10900K");
        computer1.setValueROm("512GB SSD");
        computer1.setValueRAM("32GB DDR4");

        Peripheral peripheral1 = new Peripheral();
        peripheral1.setId(1);
        peripheral1.setPeripheralName("Microsoft 120");
        peripheral1.setPeripheralType("Клавиатура");
        peripheral1.setComputerId(1);

        Peripheral peripheral2 = new Peripheral();
        peripheral2.setId(2);
        peripheral2.setPeripheralName("Genius netscrolle20");
        peripheral2.setPeripheralType("Компьютерная мышь");
        peripheral2.setComputerId(1);

        Software software1 = new Software();
        software1.setId(1);
        software1.setSoftwareName("Windows 10 Pro");
        software1.setSoftwareVersion("20H2");
        software1.setComputerId(1);

        Software software2 = new Software();
        software2.setId(2);
        software2.setSoftwareName("Microsoft Office");
        software2.setSoftwareVersion("365");
        software2.setComputerId(1);

        computer1.getPeripherals().add(peripheral1);
        computer1.getPeripherals().add(peripheral2);
        computer1.getSoftware().add(software1);
        computer1.getSoftware().add(software2);

        computers.add(computer1);
    }


    public List<Computer> getComputers() {
        return computers;
    }

    public List<Peripheral> getPeripherals() {
        return peripherals;
    }

    public List<Software> getSoftware() {
        return software;
    }

    public Computer findComputerById(int id) {
        for (Computer computer : computers) {
            if (computer.getId()==(id)) {
                return computer;
            }
        }
        return null;
    }
}

