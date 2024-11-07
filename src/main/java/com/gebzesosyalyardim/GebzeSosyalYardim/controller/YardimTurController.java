/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimTur;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimTurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emirh
 */
@RestController
@RequestMapping("/api/yardimTur")
public class YardimTurController {
     @Autowired
    private YardimTurService yardimTurService;

    @PostMapping("/add")
    public ResponseEntity<YardimTur> addYardimTur(@RequestBody YardimTur yardimTur) {
        YardimTur savedYardimTur = yardimTurService.saveYardimTur(yardimTur);
        return ResponseEntity.ok(savedYardimTur);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YardimTur> getYardimTurById(@PathVariable int id) {
        return yardimTurService.getYardimTurById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<YardimTur>> getAllYardimTurler() {
        return ResponseEntity.ok(yardimTurService.getAllYardimTurler());
    }

    @PutMapping("/update")
    public ResponseEntity<YardimTur> updateYardimTur(@RequestBody YardimTur yardimTur) {
        YardimTur updatedYardimTur = yardimTurService.updateYardimTur(yardimTur);
        return ResponseEntity.ok(updatedYardimTur);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteYardimTur(@PathVariable int id) {
        yardimTurService.deleteYardimTur(id);
        return ResponseEntity.noContent().build();
    }
}
