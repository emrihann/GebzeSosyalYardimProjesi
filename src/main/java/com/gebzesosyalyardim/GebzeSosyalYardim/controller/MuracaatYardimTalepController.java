/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatYardimTalep;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatYardimTalepService;
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
@RequestMapping("/api/muracaatyardimtalep")
public class MuracaatYardimTalepController {
     @Autowired
    private MuracaatYardimTalepService muracaatYardimTalepService;

    @GetMapping
    public List<MuracaatYardimTalep> getAllMuracaatYardimTalep() {
        return muracaatYardimTalepService.getAllMuracaatYardimTalep();
    }

    @GetMapping("/{id}")
    public Optional<MuracaatYardimTalep> getMuracaatYardimTalepById(@PathVariable Integer id) {
        return muracaatYardimTalepService.getMuracaatYardimTalepById(id);
    }

    @PostMapping
    public MuracaatYardimTalep createMuracaatYardimTalep(@RequestBody MuracaatYardimTalep muracaatYardimTalep) {
        return muracaatYardimTalepService.createMuracaatYardimTalep(muracaatYardimTalep);
    }

    @PutMapping("/{id}")
    public MuracaatYardimTalep updateMuracaatYardimTalep(@PathVariable Integer id, @RequestBody MuracaatYardimTalep muracaatYardimTalep) {
        return muracaatYardimTalepService.updateMuracaatYardimTalep(id, muracaatYardimTalep);
    }

    @DeleteMapping("/{id}")
    public void deleteMuracaatYardimTalep(@PathVariable Integer id) {
        muracaatYardimTalepService.deleteMuracaatYardimTalep(id);
    }
}
