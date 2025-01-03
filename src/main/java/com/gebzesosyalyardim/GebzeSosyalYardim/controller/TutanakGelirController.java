/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakGelirService;
import java.util.List;
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
@RequestMapping("/api/tutanakGelir")
public class TutanakGelirController {
    @Autowired
    private TutanakGelirService tutanakGelirService;

    @GetMapping
    public List<TutanakGelir> getAllTutanakGelir() {
        return tutanakGelirService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakGelir> getTutanakGelirById(@PathVariable Long id) {
        return tutanakGelirService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakGelir createTutanakGelir(@RequestBody TutanakGelir tutanakGelir) {
        return tutanakGelirService.save(tutanakGelir);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakGelir> updateTutanakGelir(@PathVariable Long id, @RequestBody TutanakGelir tutanakGelir) {
        return tutanakGelirService.findById(id)
                .map(existing -> {
                    tutanakGelir.setGelirId(existing.getGelirId());
                    return ResponseEntity.ok(tutanakGelirService.save(tutanakGelir));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakGelir(@PathVariable Long id) {
        if (tutanakGelirService.findById(id).isPresent()) {
            tutanakGelirService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
