package com.example.womenAndFlowers.controller;

import com.example.womenAndFlowers.entity.Women;
import com.example.womenAndFlowers.service.WomenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/women")
public class WomenController {

    @Autowired
    private WomenService womenService;

    @GetMapping
    public ResponseEntity<List<Women>> getAllWomen(){
        return ResponseEntity.ok(womenService.getAllWomen());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Women> getById(@PathVariable Long id){
        return ResponseEntity.ok(womenService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Women> createNewWoman(@RequestBody Women women){
        return ResponseEntity.ok(womenService.createWomen(women));
    }
}
