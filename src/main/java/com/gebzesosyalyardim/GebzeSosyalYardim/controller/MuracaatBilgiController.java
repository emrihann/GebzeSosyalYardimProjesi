/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatBilgi;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatBilgiService;
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
@RequestMapping("/api/muracaatbilgi")
public class MuracaatBilgiController {
    private final MuracaatBilgiService muracaatBilgiService;

    @Autowired
    public MuracaatBilgiController(MuracaatBilgiService muracaatBilgiService) {
        this.muracaatBilgiService = muracaatBilgiService;
    }

    @PostMapping
    public ResponseEntity<MuracaatBilgi> createMuracaatBilgi(@RequestBody MuracaatBilgi muracaatBilgi) {
        MuracaatBilgi savedMuracaatBilgi = muracaatBilgiService.saveMuracaatBilgi(muracaatBilgi);
        return new ResponseEntity<>(savedMuracaatBilgi, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MuracaatBilgi> getMuracaatBilgi(@PathVariable Long id) {
        Optional<MuracaatBilgi> muracaatBilgi = muracaatBilgiService.getMuracaatBilgiById(id);
        return muracaatBilgi.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<MuracaatBilgi> getAllMuracaatBilgi() {
        return muracaatBilgiService.getAllMuracaatBilgi();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMuracaatBilgi(@PathVariable Long id) {
        muracaatBilgiService.deleteMuracaatBilgi(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
