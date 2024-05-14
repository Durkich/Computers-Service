package com.Kalabekov.Computersservice.controller;

import com.Kalabekov.Computersservice.model.Peripheral;
import com.Kalabekov.Computersservice.service.PeripheralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "peripherals")
public class PeripheralController {

    @Autowired
    PeripheralService peripheralService;

    @RequestMapping(value="/{peripheralId}",method = RequestMethod.GET)
    public ResponseEntity<Peripheral> getPeripheral(@PathVariable("peripheralId") int peripheralId){
        Peripheral peripheral = peripheralService.getPeripheral(peripheralId);
        return ResponseEntity.ok(peripheral);
    }
    @GetMapping
    public ResponseEntity<Iterable<Peripheral>> getAllPeripherals(){
        Iterable<Peripheral> peripherals = peripheralService.getAllPeripherals();
        return ResponseEntity.ok(peripherals);
    }

    @PutMapping(value="/{peripheralId}")
    public ResponseEntity<String> updatePeripheral(@PathVariable("peripheralId") int peripheralId, @RequestBody Peripheral request){
        peripheralService.updatePeripheral(peripheralId, request);
        return ResponseEntity.ok("Переферия успешно обновлена!");

    }

    @PostMapping
    public ResponseEntity<String> createPeripheral(@RequestBody Peripheral request){
        peripheralService.createPeripheral(request);
        return ResponseEntity.ok("Переферия успешно создана!");

    }

    @DeleteMapping(value="/{peripheralId}")
    public ResponseEntity<String> deletePeripheral(@PathVariable("peripheralId") int peripheralId){
        peripheralService.deletePeripheral(peripheralId);
        return ResponseEntity.ok("Переферия успешно удалена!");
    }


}
