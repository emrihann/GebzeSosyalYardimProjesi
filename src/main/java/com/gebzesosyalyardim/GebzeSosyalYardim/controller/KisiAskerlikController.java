/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAskerlikService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/kisi-askerlik")
public class KisiAskerlikController {
    private final KisiAskerlikService kisiAskerlikService;

    @Autowired
    public KisiAskerlikController(KisiAskerlikService kisiAskerlikService) {
        this.kisiAskerlikService = kisiAskerlikService;
    }

    // Tüm KisiAskerlikleri listeleme
    @GetMapping
    public ResponseEntity<List<KisiAskerlik>> getAllKisiAskerlik() {
        List<KisiAskerlik> kisiAskerlikList = kisiAskerlikService.getAllKisiAskerlik();
        return new ResponseEntity<>(kisiAskerlikList, HttpStatus.OK);
    }

    // ID'ye göre KisiAskerlik alma
    @GetMapping("/{id}")
    public ResponseEntity<KisiAskerlik> getKisiAskerlikById(@PathVariable Integer id) {
        Optional<KisiAskerlik> kisiAskerlik = kisiAskerlikService.getKisiAskerlikById(id);
        if (kisiAskerlik.isPresent()) {
            return new ResponseEntity<>(kisiAskerlik.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Yeni KisiAskerlik oluşturma
    @PostMapping
    public ResponseEntity<KisiAskerlik> createKisiAskerlik(@RequestBody KisiAskerlik kisiAskerlik) {
        KisiAskerlik createdKisiAskerlik = kisiAskerlikService.saveKisiAskerlik(kisiAskerlik);
        return new ResponseEntity<>(createdKisiAskerlik, HttpStatus.CREATED);
    }

    // KisiAskerlik güncelleme
    @PutMapping("/{id}")
    public ResponseEntity<KisiAskerlik> updateKisiAskerlik(@PathVariable Integer id, @RequestBody KisiAskerlik kisiAskerlik) {
        KisiAskerlik updatedKisiAskerlik = kisiAskerlikService.updateKisiAskerlik(id, kisiAskerlik);
        if (updatedKisiAskerlik != null) {
            return new ResponseEntity<>(updatedKisiAskerlik, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // KisiAskerlik silme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiAskerlik(@PathVariable Integer id) {
        boolean isDeleted = kisiAskerlikService.deleteKisiAskerlik(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
