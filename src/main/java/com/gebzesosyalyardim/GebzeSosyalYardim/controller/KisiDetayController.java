/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiDetayService;
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
@RequestMapping("/api/kisi-detay")
public class KisiDetayController {
    private final KisiDetayService kisiDetayService;

    @Autowired
    public KisiDetayController(KisiDetayService kisiDetayService) {
        this.kisiDetayService = kisiDetayService;
    }

    // Tüm KisiDetay'ları listeleme
    @GetMapping
    public ResponseEntity<List<KisiDetay>> getAllKisiDetay() {
        List<KisiDetay> kisiDetayList = kisiDetayService.getAllKisiDetay();
        return new ResponseEntity<>(kisiDetayList, HttpStatus.OK);
    }

    // ID'ye göre KisiDetay alma
    @GetMapping("/{id}")
    public ResponseEntity<KisiDetay> getKisiDetayById(@PathVariable Integer id) {
        Optional<KisiDetay> kisiDetay = kisiDetayService.getKisiDetayById(id);
        if (kisiDetay.isPresent()) {
            return new ResponseEntity<>(kisiDetay.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Yeni KisiDetay oluşturma
    @PostMapping
    public ResponseEntity<KisiDetay> createKisiDetay(@RequestBody KisiDetay kisiDetay) {
        KisiDetay createdKisiDetay = kisiDetayService.saveKisiDetay(kisiDetay);
        return new ResponseEntity<>(createdKisiDetay, HttpStatus.CREATED);
    }

    // KisiDetay güncelleme
    @PutMapping("/{id}")
    public ResponseEntity<KisiDetay> updateKisiDetay(@PathVariable Integer id, @RequestBody KisiDetay kisiDetay) {
        KisiDetay updatedKisiDetay = kisiDetayService.updateKisiDetay(id, kisiDetay);
        if (updatedKisiDetay != null) {
            return new ResponseEntity<>(updatedKisiDetay, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // KisiDetay silme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiDetay(@PathVariable Integer id) {
        boolean isDeleted = kisiDetayService.deleteKisiDetay(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
