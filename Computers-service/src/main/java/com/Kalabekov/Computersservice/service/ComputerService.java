package com.Kalabekov.Computersservice.service;

import com.Kalabekov.Computersservice.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;


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

    @Qualifier("messageSource")
    @Autowired
    MessageSource messages;

    public String createComputer(Computer computer, Locale locale){
        String response = null;
        if(computer!=null){
            response = String.format(messages.getMessage(
                    "computer.create.message", null,locale),
                    computer.toString());
        }
        return response;
    }

    public String updateComputer(Computer computer, Locale locale){
        String response = null;
        if(computer!=null){
            response = String.format(messages.getMessage(
                    "computer.update.message", null,locale),
                    computer.toString());
        }
        return response;
    }

    public String deleteComputer(String computerId, Locale locale){
        String response = null;
        response = String.format(messages.getMessage(
                "computer.delete.message", null,locale),
                computerId.toString());

        return response;
    }
}
