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
@RequestMapping("/api/tutanakmulkiyet")
public class TutanakMulkiyetController {
     private TutanakMulkiyetService tutanakMulkiyetService;

    @Autowired
    public TutanakMulkiyetController(TutanakMulkiyetService tutanakMulkiyetService) {
        this.tutanakMulkiyetService = tutanakMulkiyetService;
    }

    @GetMapping
    public List<TutanakMulkiyet> getAllTutanakMulkiyet() {
        return tutanakMulkiyetService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakMulkiyet> getTutanakMulkiyetById(@PathVariable Integer id) {
        return tutanakMulkiyetService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakMulkiyet createTutanakMulkiyet(@RequestBody TutanakMulkiyet tutanakMulkiyet) {
        return tutanakMulkiyetService.save(tutanakMulkiyet);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakMulkiyet> updateTutanakMulkiyet(@PathVariable Integer id, @RequestBody TutanakMulkiyet tutanakDetails) {
        return tutanakMulkiyetService.findById(id)
                .map(existingTutanak -> {
                    existingTutanak.setMulkiyetSiraNo(tutanakDetails.getMulkiyetSiraNo());
                    existingTutanak.setEvDurumId(tutanakDetails.getEvDurumId());
                    existingTutanak.setKiraMiktar(tutanakDetails.getKiraMiktar());
                    existingTutanak.setYakacakTipId(tutanakDetails.getYakacakTipId());
                    existingTutanak.setKiradaEvVarMi(tutanakDetails.getKiradaEvVarMi());
                    existingTutanak.setKiradaEvSayisi(tutanakDetails.getKiradaEvSayisi());
                    existingTutanak.setArabaVarMi(tutanakDetails.getArabaVarMi());
                    existingTutanak.setArabaModel(tutanakDetails.getArabaModel());
                    existingTutanak.setGayrimenkulVarMi(tutanakDetails.getGayrimenkulVarMi());
                    existingTutanak.setGayrimenkulTur(tutanakDetails.getGayrimenkulTur());
                    existingTutanak.setEvTipId(tutanakDetails.getEvTipId());
                    existingTutanak.setGuncellemeTarihi(tutanakDetails.getGuncellemeTarihi());
                    existingTutanak.setEvDurumIsim(tutanakDetails.getEvDurumIsim());
                    existingTutanak.setYakacakTipIsim(tutanakDetails.getYakacakTipIsim());
                    existingTutanak.setEvTipIsim(tutanakDetails.getEvTipIsim());
                    TutanakMulkiyet updatedTutanak = tutanakMulkiyetService.save(existingTutanak);
                    return ResponseEntity.ok(updatedTutanak);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutanakMulkiyet(@PathVariable Integer id) {
        if (tutanakMulkiyetService.findById(id).isPresent()) {
            tutanakMulkiyetService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
