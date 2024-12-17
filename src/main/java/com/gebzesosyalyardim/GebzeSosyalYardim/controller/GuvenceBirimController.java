/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.GuvenceBirim;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.GuvenceBirimService;
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
@RequestMapping("/guvence-birim")
public class GuvenceBirimController {
     private final GuvenceBirimService guvenceBirimService;

    @Autowired
    public GuvenceBirimController(GuvenceBirimService guvenceBirimService) {
        this.guvenceBirimService = guvenceBirimService;
    }

    @GetMapping
    public List<GuvenceBirim> getAllGuvenceBirim() {
        return guvenceBirimService.getAllGuvenceBirim();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuvenceBirim> getGuvenceBirimById(@PathVariable Long id) {
        Optional<GuvenceBirim> guvenceBirim = guvenceBirimService.getGuvenceBirimById(id);
        return guvenceBirim.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GuvenceBirim> createGuvenceBirim(@RequestBody GuvenceBirim guvenceBirim) {
        GuvenceBirim createdGuvenceBirim = guvenceBirimService.saveGuvenceBirim(guvenceBirim);
        return ResponseEntity.ok(createdGuvenceBirim);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GuvenceBirim> updateGuvenceBirim(@PathVariable Long id, @RequestBody GuvenceBirim guvenceBirim) {
        GuvenceBirim updatedGuvenceBirim = guvenceBirimService.updateGuvenceBirim(id, guvenceBirim);
        return updatedGuvenceBirim != null ? ResponseEntity.ok(updatedGuvenceBirim) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuvenceBirim(@PathVariable Long id) {
        guvenceBirimService.deleteGuvenceBirim(id);
        return ResponseEntity.noContent().build();
    } 
}
