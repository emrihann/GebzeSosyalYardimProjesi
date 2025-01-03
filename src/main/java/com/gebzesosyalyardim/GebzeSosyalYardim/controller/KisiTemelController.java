/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiTemel;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiTemelService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/kisiTemel")
public class KisiTemelController {
   private final KisiTemelService kisiTemelService;

    public KisiTemelController(KisiTemelService kisiTemelService) {
        this.kisiTemelService = kisiTemelService;
    }

    @PostMapping("/create")
    public ResponseEntity<KisiTemel> createKisi(@Valid @RequestBody KisiTemel kisiTemel) {
        try {
            KisiTemel savedKisi = kisiTemelService.saveKisiTemel(kisiTemel);
            return new ResponseEntity<>(savedKisi, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(null);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<KisiTemel>> getAllKisiler() {
        List<KisiTemel> kisiler = kisiTemelService.getAllKisiler();
        if (kisiler.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(kisiler);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KisiTemel> getKisiById(@PathVariable Long id) {
        return kisiTemelService.getKisiById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<KisiTemel> updateKisi(@PathVariable Long id, @Valid @RequestBody KisiTemel kisiTemel) {
        try {
            KisiTemel updatedKisi = kisiTemelService.updateKisiTemel(id, kisiTemel);
            return ResponseEntity.ok(updatedKisi);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteKisi(@PathVariable Long id) {
        try {
            kisiTemelService.deleteKisiById(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
