/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiHastalik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiHastalikService;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("/kisi-hastalik")
public class KisiHastalikController {
  private final KisiHastalikService kisiHastalikService;

    @Autowired
    public KisiHastalikController(KisiHastalikService kisiHastalikService) {
        this.kisiHastalikService = kisiHastalikService;
    }

    @GetMapping
    public List<KisiHastalik> getAllKisiHastalik() {
        return kisiHastalikService.getAllKisiHastalik();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiHastalik> getKisiHastalikById(@PathVariable Long id) {
        Optional<KisiHastalik> kisiHastalik = kisiHastalikService.getKisiHastalikById(id);
        return kisiHastalik.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<KisiHastalik> createKisiHastalik(@RequestBody KisiHastalik kisiHastalik) {
        KisiHastalik createdKisiHastalik = kisiHastalikService.saveKisiHastalik(kisiHastalik);
        return ResponseEntity.ok(createdKisiHastalik);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiHastalik> updateKisiHastalik(@PathVariable Long id, @RequestBody KisiHastalik kisiHastalik) {
        KisiHastalik updatedKisiHastalik = kisiHastalikService.updateKisiHastalik(id, kisiHastalik);
        return updatedKisiHastalik != null ? ResponseEntity.ok(updatedKisiHastalik) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiHastalik(@PathVariable Long id) {
        kisiHastalikService.deleteKisiHastalik(id);
        return ResponseEntity.noContent().build();
    }  
}
