/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakDurumService;
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
@RequestMapping("/tutanak-durum")
public class TutanakDurumController {
     private final TutanakDurumService tutanakDurumService;

    @Autowired
    public TutanakDurumController(TutanakDurumService tutanakDurumService) {
        this.tutanakDurumService = tutanakDurumService;
    }

    @GetMapping
    public List<TutanakDurum> getAllTutanakDurum() {
        return tutanakDurumService.getAllTutanakDurum();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakDurum> getTutanakDurumById(@PathVariable Long id) {
        Optional<TutanakDurum> tutanakDurum = tutanakDurumService.getTutanakDurumById(id);
        return tutanakDurum.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TutanakDurum> createTutanakDurum(@RequestBody TutanakDurum tutanakDurum) {
        TutanakDurum createdTutanakDurum = tutanakDurumService.saveTutanakDurum(tutanakDurum);
        return ResponseEntity.ok(createdTutanakDurum);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakDurum> updateTutanakDurum(@PathVariable Long id, @RequestBody TutanakDurum tutanakDurum) {
        TutanakDurum updatedTutanakDurum = tutanakDurumService.updateTutanakDurum(id, tutanakDurum);
        return updatedTutanakDurum != null ? ResponseEntity.ok(updatedTutanakDurum) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakDurum(@PathVariable Long id) {
        tutanakDurumService.deleteTutanakDurum(id);
        return ResponseEntity.noContent().build();
    }
}
