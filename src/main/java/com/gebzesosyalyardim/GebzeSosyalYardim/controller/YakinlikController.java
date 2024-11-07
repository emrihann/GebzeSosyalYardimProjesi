/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yakinlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YakinlikService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author emirh
 */
@Repository
@RequestMapping("/api/ yakinlikcontrol")
public class YakinlikController {
    @Autowired
    private YakinlikService yakinlikService;

    @PostMapping("/add")
    public ResponseEntity<Yakinlik> addYakinlik(@RequestBody Yakinlik yakinlik) {
        Yakinlik savedYakinlik = yakinlikService.saveYakinlik(yakinlik);
        return ResponseEntity.ok(savedYakinlik);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Yakinlik> getYakinlikById(@PathVariable int id) {
        return yakinlikService.getYakinlikById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Yakinlik>> getAllYakinliklar() {
        return ResponseEntity.ok(yakinlikService.getAllYakinliklar());
    }

    @PutMapping("/update")
    public ResponseEntity<Yakinlik> updateYakinlik(@RequestBody Yakinlik yakinlik) {
        Yakinlik updatedYakinlik = yakinlikService.updateYakinlik(yakinlik);
        return ResponseEntity.ok(updatedYakinlik);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteYakinlik(@PathVariable int id) {
        yakinlikService.deleteYakinlik(id);
        return ResponseEntity.noContent().build();
    }
}
