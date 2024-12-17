/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Guvence;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.GuvenceService;
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
@RequestMapping("/guvence")
public class GuvenceController {
    private final GuvenceService guvenceService;

    @Autowired
    public GuvenceController(GuvenceService guvenceService) {
        this.guvenceService = guvenceService;
    }

    @GetMapping
    public List<Guvence> getAllGuvence() {
        return guvenceService.getAllGuvence();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guvence> getGuvenceById(@PathVariable Long id) {
        Optional<Guvence> guvence = guvenceService.getGuvenceById(id);
        return guvence.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Guvence> createGuvence(@RequestBody Guvence guvence) {
        Guvence createdGuvence = guvenceService.saveGuvence(guvence);
        return ResponseEntity.ok(createdGuvence);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guvence> updateGuvence(@PathVariable Long id, @RequestBody Guvence guvence) {
        Guvence updatedGuvence = guvenceService.updateGuvence(id, guvence);
        return updatedGuvence != null ? ResponseEntity.ok(updatedGuvence) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuvence(@PathVariable Long id) {
        guvenceService.deleteGuvence(id);
        return ResponseEntity.noContent().build();
    }
}
