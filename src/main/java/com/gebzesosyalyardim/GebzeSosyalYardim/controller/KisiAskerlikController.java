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
    public List<KisiAskerlik> getAllKisiAskerlik() {
        return kisiAskerlikService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiAskerlik> getKisiAskerlikById(@PathVariable Long id) {
        return kisiAskerlikService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiAskerlik createKisiAskerlik(@RequestBody KisiAskerlik kisiAskerlik) {
        return kisiAskerlikService.save(kisiAskerlik);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiAskerlik> updateKisiAskerlik(@PathVariable Long id, @RequestBody KisiAskerlik kisiAskerlik) {
        return kisiAskerlikService.findById(id)
                .map(existing -> {
                    kisiAskerlik.setAskerlikId(existing.getAskerlikId());
                    return ResponseEntity.ok(kisiAskerlikService.save(kisiAskerlik));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiAskerlik(@PathVariable Long id) {
        if (kisiAskerlikService.findById(id).isPresent()) {
            kisiAskerlikService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
