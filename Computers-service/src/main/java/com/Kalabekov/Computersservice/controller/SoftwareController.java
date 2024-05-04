package com.Kalabekov.Computersservice.controller;

import com.Kalabekov.Computersservice.model.Software;
import com.Kalabekov.Computersservice.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "software")
public class SoftwareController {

    @Autowired
    SoftwareService softwareService;

    @RequestMapping(value="/{softwareId}",method = RequestMethod.GET)
    public ResponseEntity<Software> getSoftware(@PathVariable("softwareId") int softwareId){
        Software software = softwareService.getSoftware(softwareId);
        return ResponseEntity.ok(software);
    }
    public ResponseEntity<Iterable<Software>> getAllSoftware(){
        Iterable<Software> software = softwareService.getAllSoftware();
        return ResponseEntity.ok(software);
    }

    @PutMapping(value="/{softwareId}")
    public ResponseEntity<String> updateSoftware(@PathVariable("peripheralId") int peripheralId, @RequestBody Software request){
        softwareService.updateSoftware(peripheralId, request);
        return ResponseEntity.ok("ПО успешно обновлено!");

    }

    @PostMapping
    public ResponseEntity<String> createSoftware(@RequestBody Software request){
        softwareService.createSoftware(request);
        return ResponseEntity.ok("ПО успешно создано!");

    }

    @DeleteMapping(value="/{softwareId}")
    public ResponseEntity<String> deleteSoftware(@PathVariable("softwareId") int softwareId){
        softwareService.deleteSoftware(softwareId);
        return ResponseEntity.ok("ПО успешно удалено!");
    }

}
