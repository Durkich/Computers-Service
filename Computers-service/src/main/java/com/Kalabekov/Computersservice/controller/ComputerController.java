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
    public ResponseEntity<Computer> getComputer(@PathVariable("computerId") int computerId){
            Computer computer = computerService.getComputer(computerId);
            return ResponseEntity.ok(computer);
    }

    @GetMapping
    public ResponseEntity<Iterable<Computer>> getAllComputers() {
        Iterable<Computer> computers = computerService.findAllComputers();
        return ResponseEntity.ok(computers);
    }

    @PutMapping(value="/{computerId}")
    public ResponseEntity<String> updateComputer(@PathVariable("computerId") int computerId, @RequestBody Computer request){
        computerService.updateComputer(computerId, request);
        return ResponseEntity.ok("Компьютер успешно обновлен!");

    }
    @PostMapping
    public ResponseEntity<String> createComputer(@RequestBody Computer request){
        computerService.createComputer(request);
        return ResponseEntity.ok("Компьютер успешно создан!");

    }
    @DeleteMapping(value="/{computerId}")
    public ResponseEntity<String> deleteComputer(@PathVariable("computerId") int computerId){
        computerService.deleteComputer(computerId);
        return ResponseEntity.ok("Компьютер успешно удален!");
    }




}
