/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvTipService;
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
@RequestMapping("/api/tutanakevtip")
public class TutanakEvTipController {
     private TutanakEvTipService tutanakEvTipService;

    @Autowired
    public TutanakEvTipController(TutanakEvTipService tutanakEvTipService) {
        this.tutanakEvTipService = tutanakEvTipService;
    }

    @GetMapping
    public List<TutanakEvTip> getAllEvTipleri() {
        return tutanakEvTipService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakEvTip> getEvTipById(@PathVariable Integer id) {
        return tutanakEvTipService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakEvTip createEvTip(@RequestBody TutanakEvTip tutanakEvTip) {
        return tutanakEvTipService.save(tutanakEvTip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakEvTip> updateEvTip(@PathVariable Integer id, @RequestBody TutanakEvTip evTipDetails) {
        return tutanakEvTipService.findById(id)
                .map(existingEvTip -> {
                    existingEvTip.setEvTipIsim(evTipDetails.getEvTipIsim());
                    existingEvTip.setKayitTarihi(evTipDetails.getKayitTarihi());
                    existingEvTip.setAktif(evTipDetails.getAktif());
                    existingEvTip.setGuncellemeTarihi(evTipDetails.getGuncellemeTarihi());
                    TutanakEvTip updatedEvTip = tutanakEvTipService.save(existingEvTip);
                    return ResponseEntity.ok(updatedEvTip);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvTip(@PathVariable Integer id) {
        if (tutanakEvTipService.findById(id).isPresent()) {
            tutanakEvTipService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
