/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAskerlikService;
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
@RequestMapping("/api/kisiAskerlik")
public class KisiAskerlikController {
     @Autowired
    private KisiAskerlikService kisiAskerlikService;

    @GetMapping
    public ResponseEntity<List<KisiAskerlik>> getAll() {
        return ResponseEntity.ok(kisiAskerlikService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiAskerlik> getById(@PathVariable Long id) {
        return ResponseEntity.ok(kisiAskerlikService.getById(id));
    }

    @PostMapping
    public ResponseEntity<KisiAskerlik> create(@RequestBody KisiAskerlik kisiAskerlik) {
        return ResponseEntity.ok(kisiAskerlikService.save(kisiAskerlik));
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiAskerlik> update(@PathVariable Long id, @RequestBody KisiAskerlik kisiAskerlik) {
        return ResponseEntity.ok(kisiAskerlikService.update(id, kisiAskerlik));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        kisiAskerlikService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
