/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiDetayService;
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
@RequestMapping("/kisi-detay")
public class KisiDetayController {
     private final KisiDetayService kisiDetayService;

    // Interface üzerinden injection yapılır
     @Autowired
    public KisiDetayController(KisiDetayService kisiDetayService) {
        this.kisiDetayService = kisiDetayService;
    }

    @GetMapping
    public ResponseEntity<List<KisiDetay>> getAllKisiDetay() {
        return ResponseEntity.ok(kisiDetayService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiDetay> getKisiDetayById(@PathVariable Long id) {
        return kisiDetayService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<KisiDetay> createKisiDetay(@RequestBody KisiDetay kisiDetay) {
        return ResponseEntity.ok(kisiDetayService.save(kisiDetay));
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiDetay> updateKisiDetay(@PathVariable Long id, @RequestBody KisiDetay updatedKisiDetay) {
        return kisiDetayService.findById(id)
                .map(existingKisiDetay -> {
                    updatedKisiDetay.setDetayId(existingKisiDetay.getDetayId());
                    return ResponseEntity.ok(kisiDetayService.save(updatedKisiDetay));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiDetay(@PathVariable Long id) {
        if (kisiDetayService.findById(id).isPresent()) {
            kisiDetayService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
