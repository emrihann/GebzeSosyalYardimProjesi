/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Muracaat;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatService;
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
@RequestMapping("/api/muracaatlar")
public class MuracaatController {
       @Autowired
    private MuracaatService muracaatService;

    @GetMapping
    public List<Muracaat> getAllMuracaat() {
        return muracaatService.getAllMuracaat();
    }

    @GetMapping("/{id}")
    public Optional<Muracaat> getMuracaatById(@PathVariable Integer id) {
        return muracaatService.getMuracaatById(id);
    }

    @PostMapping
    public Muracaat createMuracaat(@RequestBody Muracaat muracaat) {
        return muracaatService.createMuracaat(muracaat);
    }

    @PutMapping("/{id}")
    public Muracaat updateMuracaat(@PathVariable Integer id, @RequestBody Muracaat muracaat) {
        return muracaatService.updateMuracaat(id, muracaat);
    }

    @DeleteMapping("/{id}")
    public void deleteMuracaat(@PathVariable Integer id) {
        muracaatService.deleteMuracaat(id);
    }
}
