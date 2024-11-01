/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvDurumService;
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
@RequestMapping("/api/tutanakevdurum")
public class TutanakEvDurumController {
     @Autowired
    private TutanakEvDurumService service;

    @GetMapping
    public List<TutanakEvDurum> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakEvDurum> getById(@PathVariable Integer id) {
        Optional<TutanakEvDurum> tutanakEvDurum = service.findById(id);
        return tutanakEvDurum.map(ResponseEntity::ok)
                             .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakEvDurum create(@RequestBody TutanakEvDurum tutanakEvDurum) {
        return service.save(tutanakEvDurum);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakEvDurum> update(@PathVariable Integer id, @RequestBody TutanakEvDurum updatedTutanakEvDurum) {
        return service.findById(id)
                .map(existing -> {
                    updatedTutanakEvDurum.setEvDurumId(id);
                    TutanakEvDurum saved = service.save(updatedTutanakEvDurum);
                    return ResponseEntity.ok(saved);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
