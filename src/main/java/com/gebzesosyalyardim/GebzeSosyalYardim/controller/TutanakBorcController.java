/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakBorcService;
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
@RequestMapping("/api/tutanakBorc")
public class TutanakBorcController {
    @Autowired
    private TutanakBorcService tutanakBorcService;

    @GetMapping
    public List<TutanakBorc> getAllTutanakBorc() {
        return tutanakBorcService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakBorc> getTutanakBorcById(@PathVariable Long id) {
        return tutanakBorcService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakBorc createTutanakBorc(@RequestBody TutanakBorc tutanakBorc) {
        return tutanakBorcService.save(tutanakBorc);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakBorc> updateTutanakBorc(@PathVariable Long id, @RequestBody TutanakBorc tutanakBorc) {
        return tutanakBorcService.findById(id)
                .map(existing -> {
                    tutanakBorc.setBorcId(existing.getBorcId());
                    return ResponseEntity.ok(tutanakBorcService.save(tutanakBorc));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakBorc(@PathVariable Long id) {
        if (tutanakBorcService.findById(id).isPresent()) {
            tutanakBorcService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
