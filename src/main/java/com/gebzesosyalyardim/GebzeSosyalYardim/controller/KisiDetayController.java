/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiDetayService;
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
@RequestMapping("/kisiDetay")
public class KisiDetayController {
    @Autowired
    private KisiDetayService kisiDetayService;

    @GetMapping
    public List<KisiDetay> getAllKisiDetay() {
        return kisiDetayService.getAllKisiDetay();
    }

    @GetMapping("/{id}")
    public Optional<KisiDetay> getKisiDetayById(@PathVariable Integer id) {
        return kisiDetayService.getKisiDetayById(id);
    }

    @PostMapping
    public KisiDetay createKisiDetay(@RequestBody KisiDetay kisiDetay) {
        return kisiDetayService.createKisiDetay(kisiDetay);
    }

    @PutMapping("/{id}")
    public KisiDetay updateKisiDetay(@PathVariable Integer id, @RequestBody KisiDetay kisiDetay) {
        return kisiDetayService.updateKisiDetay(id, kisiDetay);
    }

    @DeleteMapping("/{id}")
    public void deleteKisiDetay(@PathVariable Integer id) {
        kisiDetayService.deleteKisiDetay(id);
    }
}
