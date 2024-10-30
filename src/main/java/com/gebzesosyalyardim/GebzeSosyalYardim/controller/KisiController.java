/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiService;
import java.util.List;
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
@RequestMapping("/api/kisi")
public class KisiController {
    private KisiService kisiService;

    @Autowired
    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    @GetMapping
    public List<Kisi> getAllKisi() {
        return kisiService.getAllKisi();
    }

    @GetMapping("/{id}")
    public Kisi getKisiById(@PathVariable Integer id) {
        return kisiService.getKisiById(id);
    }

    @PostMapping
    public Kisi createKisi(@RequestBody Kisi kisi) {
        return kisiService.createKisi(kisi);
    }

    @PutMapping("/{id}")
    public Kisi updateKisi(@PathVariable Integer id, @RequestBody Kisi kisi) {
        return kisiService.updateKisi(id, kisi);
    }

    @DeleteMapping("/{id}")
    public void deleteKisi(@PathVariable Integer id) {
        kisiService.deleteKisi(id);
    }
}
