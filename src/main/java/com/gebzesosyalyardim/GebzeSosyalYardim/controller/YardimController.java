/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yardim;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimService;
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
@RequestMapping("/api/ yardim")
public class YardimController {
    @Autowired
    private YardimService yardimService;

    @PostMapping("/add")
    public ResponseEntity<Yardim> addYardim(@RequestBody Yardim yardim) {
        Yardim savedYardim = yardimService.saveYardim(yardim);
        return ResponseEntity.ok(savedYardim);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Yardim> getYardimById(@PathVariable int id) {
        return yardimService.getYardimById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Yardim>> getAllYardimlar() {
        return ResponseEntity.ok(yardimService.getAllYardimlar());
    }

    @PutMapping("/update")
    public ResponseEntity<Yardim> updateYardim(@RequestBody Yardim yardim) {
        Yardim updatedYardim = yardimService.updateYardim(yardim);
        return ResponseEntity.ok(updatedYardim);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteYardim(@PathVariable int id) {
        yardimService.deleteYardim(id);
        return ResponseEntity.noContent().build();
    }
}
