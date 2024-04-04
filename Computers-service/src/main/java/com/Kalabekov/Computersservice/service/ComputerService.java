package com.Kalabekov.Computersservice.service;

import com.Kalabekov.Computersservice.model.Computer;
import org.springframework.stereotype.Service;


@Service
public class ComputerService {
    public Computer getComputer(String computerID){
        Computer computer = new Computer();
        computer.setId(1);
        computer.setDescription("Пк такой-то такой-то");
        computer.setComputerId(computerID);
        computer.setPurchaseDate("11.02.2020");
        computer.setPrice(68300f);
        return computer;
    }
    public String createComputer(Computer computer){
        String response = null;
        if(computer!=null){
            response = String.format("Это отбработка post, и объект - %s",computer.toString());
        }
        return response;
    }
    public String updateComputer(Computer computer){
        String response = null;
        if(computer!=null){
            response = String.format("Это отбработка put, и объект - %s",computer.toString());
        }
        return response;
    }
    public String deleteComputer(String computerId){
        String response = null;
        response = String.format("Удаление следующего компьютера со следующим номером %s",computerId);
        return response;
    }
}
