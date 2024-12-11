/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimStatu;
import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimTur;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimStatuService;
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
@RequestMapping("/api/yardimStatu")
public class YardimStatuController {
    
    @Autowired
    private YardimStatuService yardimStatuService;
    
      @PostMapping("/add")
    public ResponseEntity<YardimStatu> addYardimStatu(@RequestBody YardimStatu yardimStatu) {
        YardimStatu savedYardimStatu = yardimStatuService.saveYardimStatu(yardimStatu);
        return ResponseEntity.ok(savedYardimStatu);
    }

    @GetMapping("/{id}")
    public ResponseEntity<YardimStatu> getYardimStatuById(@PathVariable int id) {
        return yardimStatuService.getYardimStatuById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<YardimStatu>> getAllYardimStatu() {
        return ResponseEntity.ok(yardimStatuService.getAllYardimStatuler());
    }
    @PutMapping("/update")
    public ResponseEntity<YardimStatu> updateYardimStatu(@RequestBody YardimStatu yardimStatu) {
        YardimStatu updatedYardimStatu = yardimStatuService.updateYardimStatu(yardimStatu);
        return ResponseEntity.ok(updatedYardimStatu);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteYardimStatu(@PathVariable int id) {
        yardimStatuService.deleteYardimStatu(id);
        return ResponseEntity.noContent().build();
    }
}
