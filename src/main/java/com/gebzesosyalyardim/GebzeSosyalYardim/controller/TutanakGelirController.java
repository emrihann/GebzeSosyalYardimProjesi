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
@RequestMapping("/api/ tutanakgelir")
public class TutanakGelirController {
    @Autowired
    private TutanakGelirService tutanakGelirService;

    @GetMapping
    public ResponseEntity<List<TutanakGelir>> getAll() {
        return ResponseEntity.ok(tutanakGelirService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakGelir> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tutanakGelirService.getById(id));
    }

    @PostMapping
    public ResponseEntity<TutanakGelir> create(@RequestBody TutanakGelir tutanakGelir) {
        return ResponseEntity.ok(tutanakGelirService.save(tutanakGelir));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakGelir> update(@PathVariable Long id, @RequestBody TutanakGelir tutanakGelir) {
        return ResponseEntity.ok(tutanakGelirService.update(id, tutanakGelir));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutanakGelirService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
