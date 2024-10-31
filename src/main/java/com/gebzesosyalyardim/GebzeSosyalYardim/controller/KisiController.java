/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiService;
import java.math.BigDecimal;
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
@RequestMapping("/api/kisiler")
public class KisiController {
    private final KisiService kisiService;

    @Autowired
    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    // Yeni bir kişi ekleme
    @PostMapping
    public ResponseEntity<Kisi> createKisi(@RequestBody Kisi kisi) {
        Kisi createdKisi = kisiService.saveKisi(kisi);
        return ResponseEntity.ok(createdKisi);
    }

    // Tüm kişileri listeleme
    @GetMapping
    public ResponseEntity<List<Kisi>> getAllKisiler() {
        List<Kisi> kisiler = kisiService.getAllKisiler();
        return ResponseEntity.ok(kisiler);
    }

    // ID ile bir kişiyi getirme
    @GetMapping("/{id}")
    public ResponseEntity<Kisi> getKisiById(@PathVariable Integer id) {
        Optional<Kisi> kisi = kisiService.getKisiById(id);
        return kisi.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Kimlik numarasına göre bir kişiyi getirme
    @GetMapping("/kimlikNo/{kimlikNo}")
    public ResponseEntity<Kisi> getKisiByKimlikNo(@PathVariable BigDecimal kimlikNo) {
        Kisi kisi = kisiService.getKisiByKimlikNo(kimlikNo);
        return kisi != null ? ResponseEntity.ok(kisi) : ResponseEntity.notFound().build();
    }

    // Kişi güncelleme
    @PutMapping("/{id}")
    public ResponseEntity<Kisi> updateKisi(@PathVariable Integer id, @RequestBody Kisi kisi) {
        Optional<Kisi> existingKisi = kisiService.getKisiById(id);
        if (existingKisi.isPresent()) {
            kisi.setKisi_id(id);
            Kisi updatedKisi = kisiService.updateKisi(kisi);
            return ResponseEntity.ok(updatedKisi);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Kişiyi ID'ye göre silme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisi(@PathVariable Integer id) {
        kisiService.deleteKisiById(id);
        return ResponseEntity.noContent().build();
    }
  
}
