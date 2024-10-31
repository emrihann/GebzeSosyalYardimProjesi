/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAskerlikService;
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
@RequestMapping("/kisi-askerlik")
public class KisiAskerlikController {
    @Autowired
    private KisiAskerlikService kisiAskerlikService;

    @GetMapping
    public List<KisiAskerlik> getAllKisiAskerlik() {
        return kisiAskerlikService.getAllKisiAskerlik();
    }

    @GetMapping("/{id}")
    public Optional<KisiAskerlik> getKisiAskerlikById(@PathVariable Integer id) {
        return kisiAskerlikService.getKisiAskerlikById(id);
    }

    @PostMapping
    public KisiAskerlik createKisiAskerlik(@RequestBody KisiAskerlik kisiAskerlik) {
        return kisiAskerlikService.createKisiAskerlik(kisiAskerlik);
    }

    @PutMapping("/{id}")
    public KisiAskerlik updateKisiAskerlik(@PathVariable Integer id, @RequestBody KisiAskerlik kisiAskerlik) {
        return kisiAskerlikService.updateKisiAskerlik(id, kisiAskerlik);
    }

    @DeleteMapping("/{id}")
    public void deleteKisiAskerlik(@PathVariable Integer id) {
        kisiAskerlikService.deleteKisiAskerlik(id);
    }
    
}
