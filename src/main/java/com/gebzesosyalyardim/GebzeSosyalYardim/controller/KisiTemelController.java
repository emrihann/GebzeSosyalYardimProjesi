/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiTemel;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiTemelService;
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
@RequestMapping("/api/kisiTemel")
public class KisiTemelController {
     private final KisiTemelService kisiTemelService;

    @Autowired
    public KisiTemelController(KisiTemelService kisiTemelService) {
        this.kisiTemelService = kisiTemelService;
    }

    @GetMapping
    public List<KisiTemel> getAllKisiTemel() {
        return kisiTemelService.getAllKisiTemel();
    }

    @GetMapping("/{kisiId}")
    public ResponseEntity<KisiTemel> getKisiTemelById(@PathVariable Long kisiId) {
        Optional<KisiTemel> kisiTemel = kisiTemelService.getKisiTemelById(kisiId);
        return kisiTemel.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiTemel createKisiTemel(@RequestBody KisiTemel kisiTemel) {
        return kisiTemelService.saveKisiTemel(kisiTemel);
    }

    @PutMapping("/{kisiId}")
    public ResponseEntity<KisiTemel> updateKisiTemel(@PathVariable Long kisiId, @RequestBody KisiTemel kisiTemel) {
        KisiTemel updatedKisiTemel = kisiTemelService.updateKisiTemel(kisiId, kisiTemel);
        return updatedKisiTemel != null ? ResponseEntity.ok(updatedKisiTemel) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{kisiId}")
    public ResponseEntity<Void> deleteKisiTemel(@PathVariable Long kisiId) {
        kisiTemelService.deleteKisiTemel(kisiId);
        return ResponseEntity.noContent().build();
    }
}
