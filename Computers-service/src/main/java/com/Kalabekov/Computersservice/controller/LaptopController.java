package com.Kalabekov.Computersservice.controller;


import com.Kalabekov.Computersservice.model.Laptop;
import com.Kalabekov.Computersservice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping(value="/{laptopId}")
    public ResponseEntity<Laptop> getLaptop(@PathVariable("laptopId") int laptopId){
        Laptop laptop = laptopService.getLaptop(laptopId);
        return ResponseEntity.ok(laptop);
    }

    @GetMapping
    public ResponseEntity<Iterable<Laptop>> getAllLaptops() {
        Iterable<Laptop> laptops = laptopService.findAllLaptops();
        return ResponseEntity.ok(laptops);
    }

    @PutMapping(value="/{laptopId}")
    public ResponseEntity<String> updateLaptop(@PathVariable("laptopId") int laptopId, @RequestBody Laptop request){
        laptopService.updateLaptop(laptopId, request);
        return ResponseEntity.ok("Ноутбук успешно обновлен!");
    }

    @PostMapping
    public ResponseEntity<String> createLaptop(@RequestBody Laptop request){
        laptopService.createLaptop(request);
        return ResponseEntity.ok("Ноутбук успешно создан!");
    }

    @DeleteMapping(value="/{laptopId}")
    public ResponseEntity<String> deleteLaptop(@PathVariable("laptopId") int laptopId){
        laptopService.deleteLaptop(laptopId);
        return ResponseEntity.ok("Ноутбук успешно удален!");
    }
}
