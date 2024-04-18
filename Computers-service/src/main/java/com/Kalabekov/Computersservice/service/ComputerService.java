package com.Kalabekov.Computersservice.service;

import com.Kalabekov.Computersservice.CollectionHandler;
import com.Kalabekov.Computersservice.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    @Autowired
    private CollectionHandler collectionHandler;

    public Computer getComputer(int computerID){
        return collectionHandler.findComputerById(computerID);
    }


    public void createComputer(Computer computer){
        if(computer!=null){
            collectionHandler.addComputer(computer);
        }
    }

    public void updateComputer(int computerId,Computer computer){
        Computer existingComputer = collectionHandler.findComputerById(computerId);
        if (existingComputer != null) {
            collectionHandler.getComputers().set(
                    collectionHandler.getComputers().indexOf(existingComputer),
                    computer
            );
        }
    }

    public void deleteComputer(int computerId){
        Computer existingComputer = collectionHandler.findComputerById(computerId);
        if (existingComputer != null) {
            collectionHandler.getComputers().remove(existingComputer);
        }
    }
}
