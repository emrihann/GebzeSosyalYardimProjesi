/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEngel;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiEngelService;
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
@RequestMapping("/api/kisi-engel")
public class KisiEngelController {
    @Autowired
    private KisiEngelService kisiEngelService;

    @GetMapping
    public List<KisiEngel> getAllKisiEngel() {
        return kisiEngelService.getAllKisiEngel();
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiEngel> getKisiEngelById(@PathVariable Integer id) {
        Optional<KisiEngel> kisiEngel = kisiEngelService.getKisiEngelById(id);
        return kisiEngel.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KisiEngel createKisiEngel(@RequestBody KisiEngel kisiEngel) {
        return kisiEngelService.createKisiEngel(kisiEngel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KisiEngel> updateKisiEngel(@PathVariable Integer id, @RequestBody KisiEngel kisiEngel) {
        KisiEngel updatedKisiEngel = kisiEngelService.updateKisiEngel(id, kisiEngel);
        return ResponseEntity.ok(updatedKisiEngel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisiEngel(@PathVariable Integer id) {
        kisiEngelService.deleteKisiEngel(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
