/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakBorcService;
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
@RequestMapping("/api/borclar")
public class TutanakBorcController {
    private final TutanakBorcService tutanakBorcService;

    @Autowired
    public TutanakBorcController(TutanakBorcService tutanakBorcService) {
        this.tutanakBorcService = tutanakBorcService;
    }

    @PostMapping
    public ResponseEntity<TutanakBorc> createBorc(@RequestBody TutanakBorc tutanakBorc) {
        return ResponseEntity.ok(tutanakBorcService.saveBorc(tutanakBorc));
    }

    @GetMapping
    public ResponseEntity<List<TutanakBorc>> getAllBorcs() {
        return ResponseEntity.ok(tutanakBorcService.getAllBorcs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakBorc> getBorcById(@PathVariable Long id) {
        return tutanakBorcService.getBorcById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakBorc> updateBorc(@PathVariable Long id, @RequestBody TutanakBorc tutanakBorc) {
        return ResponseEntity.ok(tutanakBorcService.updateBorc(id, tutanakBorc));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorc(@PathVariable Long id) {
        tutanakBorcService.deleteBorc(id);
        return ResponseEntity.noContent().build();
    }
}
