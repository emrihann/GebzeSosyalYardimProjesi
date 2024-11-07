/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakInceleme;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakIncelemeService;
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
@RequestMapping("/api/ tutanakinceleme")
public class TutanakIncelemeController {
     private TutanakIncelemeService tutanakIncelemeService;

    @Autowired
    public TutanakIncelemeController(TutanakIncelemeService tutanakIncelemeService) {
        this.tutanakIncelemeService = tutanakIncelemeService;
    }

    @GetMapping
    public List<TutanakInceleme> getAllTutanakIncelemeler() {
        return tutanakIncelemeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakInceleme> getTutanakIncelemeById(@PathVariable String id) {
        return tutanakIncelemeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakInceleme createTutanakInceleme(@RequestBody TutanakInceleme tutanakInceleme) {
        return tutanakIncelemeService.save(tutanakInceleme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakInceleme> updateTutanakInceleme(@PathVariable String id, @RequestBody TutanakInceleme tutanakDetails) {
        return tutanakIncelemeService.findById(id)
                .map(existingTutanak -> {
                    existingTutanak.setTutanak_inceleme(tutanakDetails.getTutanak_inceleme());
                    TutanakInceleme updatedTutanak = tutanakIncelemeService.save(existingTutanak);
                    return ResponseEntity.ok(updatedTutanak);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakInceleme(@PathVariable String id) {
        if (tutanakIncelemeService.findById(id).isPresent()) {
            tutanakIncelemeService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
