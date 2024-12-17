/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakMulkiyetService;
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
@RequestMapping("/api/tutanakMulkiyet")
public class TutanakMulkiyetController {
     @Autowired
    private TutanakMulkiyetService tutanakMulkiyetService;

    @GetMapping
    public ResponseEntity<List<TutanakMulkiyet>> getAll() {
        return ResponseEntity.ok(tutanakMulkiyetService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakMulkiyet> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tutanakMulkiyetService.getById(id));
    }

    @PostMapping
    public ResponseEntity<TutanakMulkiyet> create(@RequestBody TutanakMulkiyet tutanakMulkiyet) {
        return ResponseEntity.ok(tutanakMulkiyetService.save(tutanakMulkiyet));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakMulkiyet> update(@PathVariable Long id, @RequestBody TutanakMulkiyet tutanakMulkiyet) {
        return ResponseEntity.ok(tutanakMulkiyetService.update(id, tutanakMulkiyet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutanakMulkiyetService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
