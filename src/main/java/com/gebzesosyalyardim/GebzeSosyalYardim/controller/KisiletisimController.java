/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiIletisim;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiIletisimService;
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
@RequestMapping("/api/kisi-iletisim")
public class KisiletisimController {
    private final KisiIletisimService kisiIletisimService;

    @Autowired
    public KisiletisimController(KisiIletisimService kisiIletisimService) {
        this.kisiIletisimService = kisiIletisimService;
    }

    @GetMapping
    public List<KisiIletisim> getAllKisiIletisim() {
        return kisiIletisimService.getAllKisiIletisim();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiIletisim> getKisiIletisimById(@PathVariable Long id) {
        Optional<KisiIletisim> kisiIletisim = kisiIletisimService.getKisiIletisimById(id);
        return kisiIletisim.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<KisiIletisim> createKisiIletisim(@RequestBody KisiIletisim kisiIletisim) {
        KisiIletisim createdKisiIletisim = kisiIletisimService.saveKisiIletisim(kisiIletisim);
        return ResponseEntity.ok(createdKisiIletisim);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiIletisim> updateKisiIletisim(@PathVariable Long id, @RequestBody KisiIletisim kisiIletisim) {
        KisiIletisim updatedKisiIletisim = kisiIletisimService.updateKisiIletisim(id, kisiIletisim);
        return updatedKisiIletisim != null ? ResponseEntity.ok(updatedKisiIletisim) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiIletisim(@PathVariable Long id) {
        kisiIletisimService.deleteKisiIletisim(id);
        return ResponseEntity.noContent().build();
    }
}
