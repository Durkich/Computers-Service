package com.Kalabekov.Computersservice.controller;

import com.Kalabekov.Computersservice.model.Computer;
import com.Kalabekov.Computersservice.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "computers")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @RequestMapping(value="/{computerId}",method = RequestMethod.GET)
    public ResponseEntity<Computer> getComputer(@PathVariable("computerId") String computerId){
            Computer computer = computerService.getComputer(computerId);
            return ResponseEntity.ok(computer);
    }
    @PutMapping
    public ResponseEntity<String> updateComputer(@RequestBody Computer request){
        return ResponseEntity.ok(computerService.updateComputer(request));

    }
    @PostMapping
    public ResponseEntity<String> createComputer(@RequestBody Computer request){
        return ResponseEntity.ok(computerService.createComputer(request));

    }
    @DeleteMapping(value="/{computerId}")
    public ResponseEntity<String> deleteComputer(@PathVariable("computerId") String computerId){
        return ResponseEntity.ok(computerService.deleteComputer(computerId));
    }




}
