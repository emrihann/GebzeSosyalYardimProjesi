/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimAlt;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimAltService;
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
@RequestMapping("/api/yardimAlt")
public class YardimAltController {
     @Autowired
    private YardimAltService yardimAltService;

    @PostMapping("/add")
    public ResponseEntity<YardimAlt> addYardimAlt(@RequestBody YardimAlt yardimAlt) {
        YardimAlt savedYardimAlt = yardimAltService.saveYardimAlt(yardimAlt);
        return ResponseEntity.ok(savedYardimAlt);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YardimAlt> getYardimAltById(@PathVariable int id) {
        return yardimAltService.getYardimAltById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<YardimAlt>> getAllYardimAltlar() {
        return ResponseEntity.ok(yardimAltService.getAllYardimAltlar());
    }

    @PutMapping("/update")
    public ResponseEntity<YardimAlt> updateYardimAlt(@RequestBody YardimAlt yardimAlt) {
        YardimAlt updatedYardimAlt = yardimAltService.updateYardimAlt(yardimAlt);
        return ResponseEntity.ok(updatedYardimAlt);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteYardimAlt(@PathVariable int id) {
        yardimAltService.deleteYardimAlt(id);
        return ResponseEntity.noContent().build();
    }
}
