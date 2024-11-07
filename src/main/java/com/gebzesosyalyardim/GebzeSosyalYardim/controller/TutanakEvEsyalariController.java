/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvEsyalari;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvEsyalariService;
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
    @RequestMapping("/api/tutanakevesyalari")
public class TutanakEvEsyalariController {
      private TutanakEvEsyalariService tutanakEvEsyalariService;

    @Autowired
    public TutanakEvEsyalariController(TutanakEvEsyalariService tutanakEvEsyalariService) {
        this.tutanakEvEsyalariService = tutanakEvEsyalariService;
    }

    @GetMapping
    public List<TutanakEvEsyalari> getAllEsyalar() {
        return tutanakEvEsyalariService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakEvEsyalari> getEsyaById(@PathVariable Integer id) {
        return tutanakEvEsyalariService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakEvEsyalari createEsya(@RequestBody TutanakEvEsyalari tutanakEvEsyalari) {
        return tutanakEvEsyalariService.save(tutanakEvEsyalari);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakEvEsyalari> updateEsya(@PathVariable Integer id, @RequestBody TutanakEvEsyalari esyaDetails) {
        return tutanakEvEsyalariService.findById(id)
                .map(existingEsya -> {
                    existingEsya.setKisiId(esyaDetails.getKisiId());
                    existingEsya.setKisiIsim(esyaDetails.getKisiIsim());
                    existingEsya.setEsyaId(esyaDetails.getEsyaId());
                    existingEsya.setEsyaIsim(esyaDetails.getEsyaIsim());
                    existingEsya.setGuncellemeTarihi(esyaDetails.getGuncellemeTarihi());
                    existingEsya.setAktiflik(esyaDetails.getAktiflik());
                    TutanakEvEsyalari updatedEsya = tutanakEvEsyalariService.save(existingEsya);
                    return ResponseEntity.ok(updatedEsya);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEsya(@PathVariable Integer id) {
        if (tutanakEvEsyalariService.findById(id).isPresent()) {
            tutanakEvEsyalariService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
