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
    private TutanakGelirService tutanakGelirService;

    @Autowired
    public TutanakGelirController(TutanakGelirService tutanakGelirService) {
        this.tutanakGelirService = tutanakGelirService;
    }

    @GetMapping
    public List<TutanakGelir> getAllGelirler() {
        return tutanakGelirService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutanakGelir> getGelirById(@PathVariable Integer id) {
        return tutanakGelirService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TutanakGelir createGelir(@RequestBody TutanakGelir tutanakGelir) {
        return tutanakGelirService.save(tutanakGelir);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TutanakGelir> updateGelir(@PathVariable Integer id, @RequestBody TutanakGelir gelirDetails) {
        return tutanakGelirService.findById(id)
                .map(existingGelir -> {
                    existingGelir.setYaslilik(gelirDetails.getYaslilik());
                    existingGelir.setEngelli(gelirDetails.getEngelli());
                    existingGelir.setEngelliYakini(gelirDetails.getEngelliYakini());
                    existingGelir.setYetimAyligi(gelirDetails.getYetimAyligi());
                    existingGelir.setEmekliMaasi(gelirDetails.getEmekliMaasi());
                    existingGelir.setEvdeBakimParasi(gelirDetails.getEvdeBakimParasi());
                    existingGelir.setDulMaasi(gelirDetails.getDulMaasi());
                    existingGelir.setIssizlikMaasi(gelirDetails.getIssizlikMaasi());
                    existingGelir.setAskerMaasi(gelirDetails.getAskerMaasi());
                    existingGelir.setKiraMaasi(gelirDetails.getKiraMaasi());
                    existingGelir.setKaymakamlik(gelirDetails.getKaymakamlik());
                    existingGelir.setSosyalHizmetler(gelirDetails.getSosyalHizmetler());
                    existingGelir.setBuyuksehir(gelirDetails.getBuyuksehir());
                    existingGelir.setOzelVakif(gelirDetails.getOzelVakif());
                    existingGelir.setDiger(gelirDetails.getDiger());
                    existingGelir.setDigerAciklama(gelirDetails.getDigerAciklama());
                    existingGelir.setAktif(gelirDetails.getAktif());
                    existingGelir.setKayitTarihi(gelirDetails.getKayitTarihi());
                    existingGelir.setGuncellemeTarihi(gelirDetails.getGuncellemeTarihi());
                    TutanakGelir updatedGelir = tutanakGelirService.save(existingGelir);
                    return ResponseEntity.ok(updatedGelir);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGelir(@PathVariable Integer id) {
        if (tutanakGelirService.findById(id).isPresent()) {
            tutanakGelirService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
