/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAdres;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAdresService;
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
@RequestMapping("/api/kisiAdres")
public class KisiAdresController {
      @Autowired
    private KisiAdresService kisiAdresService;

    @GetMapping
    public List<KisiAdres> getAllKisiAdres() {
        return kisiAdresService.getAllKisiAdres();
    }

    @GetMapping("/{id}")
    public Optional<KisiAdres> getKisiAdresById(@PathVariable Integer id) {
        return kisiAdresService.getKisiAdresById(id);
    }

    @PostMapping
    public KisiAdres createKisiAdres(@RequestBody KisiAdres kisiAdres) {
        return kisiAdresService.createKisiAdres(kisiAdres);
    }

    @PutMapping("/{id}")
    public KisiAdres updateKisiAdres(@PathVariable Integer id, @RequestBody KisiAdres kisiAdres) {
        return kisiAdresService.updateKisiAdres(id, kisiAdres);
    }

    @DeleteMapping("/{id}")
    public void deleteKisiAdres(@PathVariable Integer id) {
        kisiAdresService.deleteKisiAdres(id);
    }
}
