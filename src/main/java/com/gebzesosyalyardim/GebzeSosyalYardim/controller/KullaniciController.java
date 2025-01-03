/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kullanici;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KullaniciService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emirh
 */
@RestController
@RequestMapping("/api/kullanicilar")
public class KullaniciController {
    private final KullaniciService kullaniciService;

    @Autowired
    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @PostMapping
    public Kullanici createKullanici(@RequestBody Kullanici kullanici) {
        return kullaniciService.saveKullanici(kullanici);
    }

    @GetMapping("/{id}")
    public Kullanici getKullaniciById(@PathVariable Long id) {
        return kullaniciService.getKullaniciById(id);
    }

    @GetMapping
    public List<Kullanici> getAllKullanicilar() {
        return kullaniciService.getAllKullanicilar();
    }

    @DeleteMapping("/{id}")
    public void deleteKullanici(@PathVariable Long id) {
        kullaniciService.deleteKullanici(id);
    }
}
