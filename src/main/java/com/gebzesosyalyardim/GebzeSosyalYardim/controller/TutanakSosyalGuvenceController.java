/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakSosyalGuvence;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakSosyalGuvenceService;
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
@RequestMapping("/api/tutanaksosyalgüvence")
public class TutanakSosyalGuvenceController {
    
    private TutanakSosyalGuvenceService tutanakSosyalGuvenceService;

    @Autowired
    public TutanakSosyalGuvenceController(TutanakSosyalGuvenceService tutanakSosyalGuvenceService) {
       
    }

    @GetMapping
    public List<TutanakSosyalGuvence> getAllTutanakSosyalGuvence() {
        return tutanakSosyalGuvenceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakSosyalGuvence> getTutanakSosyalGuvenceById(@PathVariable Integer id) {
        return tutanakSosyalGuvenceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakSosyalGuvence createTutanakSosyalGuvence(@RequestBody TutanakSosyalGuvence tutanakSosyalGuvence) {
        return tutanakSosyalGuvenceService.save(tutanakSosyalGuvence);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakSosyalGuvence> updateTutanakSosyalGuvence(@PathVariable Integer id, @RequestBody TutanakSosyalGuvence tutanakDetails) {
        return tutanakSosyalGuvenceService.findById(id)
                .map(existingTutanak -> {
                    existingTutanak.setGuvenceVarMi(tutanakDetails.getGuvenceVarMi());
                    existingTutanak.setGuvenceId(tutanakDetails.getGuvenceId());
                    existingTutanak.setBirimId(tutanakDetails.getBirimId());
                    existingTutanak.setBirimAciklama(tutanakDetails.getBirimAciklama());
                    existingTutanak.setGuncellemeTarihi(tutanakDetails.getGuncellemeTarihi());
                    TutanakSosyalGuvence updatedTutanak = tutanakSosyalGuvenceService.save(existingTutanak);
                    return ResponseEntity.ok(updatedTutanak);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakSosyalGuvence(@PathVariable Integer id) {
        if (tutanakSosyalGuvenceService.findById(id).isPresent()) {
            tutanakSosyalGuvenceService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
