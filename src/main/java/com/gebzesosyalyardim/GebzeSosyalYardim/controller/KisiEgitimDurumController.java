/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEgitimDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiEgitimDurumService;
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
@RequestMapping("/api/kisi-egitim-durum")
public class KisiEgitimDurumController {
     private final KisiEgitimDurumService kisiEgitimDurumService;

    @Autowired
    public KisiEgitimDurumController(KisiEgitimDurumService kisiEgitimDurumService) {
        this.kisiEgitimDurumService = kisiEgitimDurumService;
    }

    @GetMapping
    public List<KisiEgitimDurum> getAllKisiEgitimDurum() {
        return kisiEgitimDurumService.getAllKisiEgitimDurum();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiEgitimDurum> getKisiEgitimDurumById(@PathVariable Long id) {
        Optional<KisiEgitimDurum> kisiEgitimDurum = kisiEgitimDurumService.getKisiEgitimDurumById(id);
        return kisiEgitimDurum.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<KisiEgitimDurum> createKisiEgitimDurum(@RequestBody KisiEgitimDurum kisiEgitimDurum) {
        KisiEgitimDurum createdKisiEgitimDurum = kisiEgitimDurumService.saveKisiEgitimDurum(kisiEgitimDurum);
        return ResponseEntity.ok(createdKisiEgitimDurum);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiEgitimDurum> updateKisiEgitimDurum(@PathVariable Long id, @RequestBody KisiEgitimDurum kisiEgitimDurum) {
        KisiEgitimDurum updatedKisiEgitimDurum = kisiEgitimDurumService.updateKisiEgitimDurum(id, kisiEgitimDurum);
        return updatedKisiEgitimDurum != null ? ResponseEntity.ok(updatedKisiEgitimDurum) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiEgitimDurum(@PathVariable Long id) {
        kisiEgitimDurumService.deleteKisiEgitimDurum(id);
        return ResponseEntity.noContent().build();
    }
}
