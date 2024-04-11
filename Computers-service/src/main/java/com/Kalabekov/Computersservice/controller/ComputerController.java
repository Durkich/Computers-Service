package com.Kalabekov.Computersservice.controller;

import com.Kalabekov.Computersservice.model.Computer;
import com.Kalabekov.Computersservice.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

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
    public ResponseEntity<String> updateComputer(@RequestBody Computer request, @RequestHeader(value = "Accept-Language",required = false) Locale locale){
        return ResponseEntity.ok(computerService.updateComputer(request, locale));

    }
    @PostMapping
    public ResponseEntity<String> createComputer(@RequestBody Computer request, @RequestHeader(value = "Accept-Language",required = false) Locale locale){
        return ResponseEntity.ok(computerService.createComputer(request,locale));

    }
    @DeleteMapping(value="/{computerId}")
    public ResponseEntity<String> deleteComputer(@PathVariable("computerId") String computerId, @RequestHeader(value = "Accept-Language",required = false) Locale locale){
        return ResponseEntity.ok(computerService.deleteComputer(computerId, locale));
    }




}
