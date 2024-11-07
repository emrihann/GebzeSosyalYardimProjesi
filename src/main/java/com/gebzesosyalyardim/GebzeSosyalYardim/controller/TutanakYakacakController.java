/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakYakacak;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakYakacakService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/tutanakyakacak")
public class TutanakYakacakController {
    private  TutanakYakacakService tutanakYakacakService;

    @Autowired
    public TutanakYakacakController(TutanakYakacakService tutanakYakacakService) {
       
    }

    @GetMapping
    public List<TutanakYakacak> findAll() {
        return tutanakYakacakService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakYakacak> findById(@PathVariable Integer id) {
        Optional<TutanakYakacak> tutanakYakacak = tutanakYakacakService.findById(id);
        return tutanakYakacak.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TutanakYakacak> save(@RequestBody TutanakYakacak tutanakYakacak) {
        TutanakYakacak createdTutanakYakacak = tutanakYakacakService.save(tutanakYakacak);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTutanakYakacak);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakYakacak> update(@PathVariable Integer id, @RequestBody TutanakYakacak tutanakYakacak) {
        Optional<TutanakYakacak> existingTutanakYakacak = tutanakYakacakService.findById(id);
        if (existingTutanakYakacak.isPresent()) {
            tutanakYakacak.setTutanakYakacakTipId(id);
            TutanakYakacak updatedTutanakYakacak = tutanakYakacakService.save(tutanakYakacak);
            return ResponseEntity.ok(updatedTutanakYakacak);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        if (tutanakYakacakService.findById(id).isPresent()) {
            tutanakYakacakService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
