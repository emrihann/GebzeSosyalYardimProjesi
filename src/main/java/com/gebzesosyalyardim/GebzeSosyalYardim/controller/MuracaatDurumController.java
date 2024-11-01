/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatDurumService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/muracaatdurum")
public class MuracaatDurumController {
      @Autowired
    private MuracaatDurumService muracaatDurumService;

    @GetMapping
    public List<MuracaatDurum> getAllMuracaatDurum() {
        return muracaatDurumService.getAllMuracaatDurum();
    }

    @GetMapping("/{id}")
    public Optional<MuracaatDurum> getMuracaatDurumById(@PathVariable Integer id) {
        return muracaatDurumService.getMuracaatDurumById(id);
    }

    @PostMapping
    public MuracaatDurum createMuracaatDurum(@RequestBody MuracaatDurum muracaatDurum) {
        return muracaatDurumService.createMuracaatDurum(muracaatDurum);
    }

    @PutMapping("/{id}")
    public MuracaatDurum updateMuracaatDurum(@PathVariable Integer id, @RequestBody MuracaatDurum muracaatDurum) {
        return muracaatDurumService.updateMuracaatDurum(id, muracaatDurum);
    }

    @DeleteMapping("/{id}")
    public void deleteMuracaatDurum(@PathVariable Integer id) {
        muracaatDurumService.deleteMuracaatDurum(id);
    }
}
