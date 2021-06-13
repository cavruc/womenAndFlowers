package com.example.womenAndFlowers.controller;

import com.example.womenAndFlowers.entity.Woman;
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
    public ResponseEntity<List<Woman>> getAllWomen(){
        return ResponseEntity.ok(womenService.getAllWomen());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Woman> getById(@PathVariable Long id){
        return ResponseEntity.ok(womenService.getById(id));
    }

    @PostMapping
    public ResponseEntity<List<Woman>> createNewWoman(@RequestBody List<Woman> women){
        return ResponseEntity.ok(womenService.createWomen(women));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Woman> updateWoman(@PathVariable Long id, @RequestBody Woman woman){
        return ResponseEntity.ok(womenService.updateWoman(id, woman));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWoman(@PathVariable Long id){
        womenService.deleteWoman(id);
        return ResponseEntity.ok().build();
    }
}
