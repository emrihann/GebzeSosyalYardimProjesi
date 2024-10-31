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
@RequestMapping("/api/kisi-iletisim")
public class KisiletisimController {
    @Autowired
    private KisiIletisimService kisiIletisimService;

    @GetMapping
    public List<KisiIletisim> getAllKisiIletisim() {
        return kisiIletisimService.getAllKisiIletisim();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiIletisim> getKisiIletisimById(@PathVariable Integer id) {
        Optional<KisiIletisim> kisiIletisim = kisiIletisimService.getKisiIletisimById(id);
        return kisiIletisim.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiIletisim createKisiIletisim(@RequestBody KisiIletisim kisiIletisim) {
        return kisiIletisimService.createKisiIletisim(kisiIletisim);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiIletisim> updateKisiIletisim(@PathVariable Integer id, @RequestBody KisiIletisim kisiIletisim) {
        KisiIletisim updatedKisiIletisim = kisiIletisimService.updateKisiIletisim(id, kisiIletisim);
        return ResponseEntity.ok(updatedKisiIletisim);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiIletisim(@PathVariable Integer id) {
        kisiIletisimService.deleteKisiIletisim(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
