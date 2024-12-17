/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Hastalik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.HastalikService;
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
@RequestMapping("/hastalik")
public class HastalikController {
    private final HastalikService hastalikService;

    @Autowired
    public HastalikController(HastalikService hastalikService) {
        this.hastalikService = hastalikService;
    }

    @GetMapping
    public List<Hastalik> getAllHastalik() {
        return hastalikService.getAllHastalik();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hastalik> getHastalikById(@PathVariable Long id) {
        Optional<Hastalik> hastalik = hastalikService.getHastalikById(id);
        return hastalik.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Hastalik> createHastalik(@RequestBody Hastalik hastalik) {
        Hastalik createdHastalik = hastalikService.saveHastalik(hastalik);
        return ResponseEntity.ok(createdHastalik);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hastalik> updateHastalik(@PathVariable Long id, @RequestBody Hastalik hastalik) {
        Hastalik updatedHastalik = hastalikService.updateHastalik(id, hastalik);
        return updatedHastalik != null ? ResponseEntity.ok(updatedHastalik) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHastalik(@PathVariable Long id) {
        hastalikService.deleteHastalik(id);
        return ResponseEntity.noContent().build();
    }
}
