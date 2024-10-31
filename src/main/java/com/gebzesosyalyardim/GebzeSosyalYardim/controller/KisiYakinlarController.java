/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlar;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiYakinlarService;
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
@RequestMapping("/api/kisi-yakinlar")
public class KisiYakinlarController {
     @Autowired
    private KisiYakinlarService kisiYakinlarService;

    @GetMapping
    public List<KisiYakinlar> getAllKisiYakinlar() {
        return kisiYakinlarService.getAllKisiYakinlar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiYakinlar> getKisiYakinlarById(@PathVariable Integer id) {
        Optional<KisiYakinlar> kisiYakinlar = kisiYakinlarService.getKisiYakinlarById(id);
        return kisiYakinlar.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiYakinlar createKisiYakinlar(@RequestBody KisiYakinlar kisiYakinlar) {
        return kisiYakinlarService.createKisiYakinlar(kisiYakinlar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiYakinlar> updateKisiYakinlar(@PathVariable Integer id, @RequestBody KisiYakinlar kisiYakinlar) {
        KisiYakinlar updatedKisiYakinlar = kisiYakinlarService.updateKisiYakinlar(id, kisiYakinlar);
        return ResponseEntity.ok(updatedKisiYakinlar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiYakinlar(@PathVariable Integer id) {
        kisiYakinlarService.deleteKisiYakinlar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
