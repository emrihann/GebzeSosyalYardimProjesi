/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KurumService;
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
@RequestMapping("/api/kurumlar")
public class KurumController {
     @Autowired
    private KurumService kurumService;

    @GetMapping
    public List<Kurum> getAllKurum() {
        return kurumService.getAllKurum();
    }

    @GetMapping("/{id}")
    public Optional<Kurum> getKurumById(@PathVariable Integer id) {
        return kurumService.getKurumById(id);
    }

    @PostMapping
    public Kurum createKurum(@RequestBody Kurum kurum) {
        return kurumService.createKurum(kurum);
    }

    @PutMapping("/{id}")
    public Kurum updateKurum(@PathVariable Integer id, @RequestBody Kurum kurum) {
        return kurumService.updateKurum(id, kurum);
    }

    @DeleteMapping("/{id}")
    public void deleteKurum(@PathVariable Integer id) {
        kurumService.deleteKurum(id);
    }
}
