/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlarStatu;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiYakinlarStatuService;
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
@RequestMapping("/api/kisi-yakinlar-statu")
public class KisiYakinlarStatuController {
      @Autowired
    private KisiYakinlarStatuService kisiYakinlarStatuService;

    @GetMapping
    public List<KisiYakinlarStatu> getAllKisiYakinlarStatu() {
        return kisiYakinlarStatuService.getAllKisiYakinlarStatu();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiYakinlarStatu> getKisiYakinlarStatuById(@PathVariable Integer id) {
        Optional<KisiYakinlarStatu> kisiYakinlarStatu = kisiYakinlarStatuService.getKisiYakinlarStatuById(id);
        return kisiYakinlarStatu.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiYakinlarStatu createKisiYakinlarStatu(@RequestBody KisiYakinlarStatu kisiYakinlarStatu) {
        return kisiYakinlarStatuService.createKisiYakinlarStatu(kisiYakinlarStatu);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiYakinlarStatu> updateKisiYakinlarStatu(@PathVariable Integer id, @RequestBody KisiYakinlarStatu kisiYakinlarStatu) {
        KisiYakinlarStatu updatedKisiYakinlarStatu = kisiYakinlarStatuService.updateKisiYakinlarStatu(id, kisiYakinlarStatu);
        return ResponseEntity.ok(updatedKisiYakinlarStatu);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiYakinlarStatu(@PathVariable Integer id) {
        kisiYakinlarStatuService.deleteKisiYakinlarStatu(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
