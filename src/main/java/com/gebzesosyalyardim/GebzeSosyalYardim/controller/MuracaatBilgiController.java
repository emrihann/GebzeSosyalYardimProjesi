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
    @Autowired
    private MuracaatBilgiService muracaatBilgiService;

    @GetMapping
    public List<MuracaatBilgi> getAllMuracaatBilgi() {
        return muracaatBilgiService.getAllMuracaatBilgi();
    }

    @GetMapping("/{id}")
    public Optional<MuracaatBilgi> getMuracaatBilgiById(@PathVariable Integer id) {
        return muracaatBilgiService.getMuracaatBilgiById(id);
    }

    @PostMapping
    public MuracaatBilgi createMuracaatBilgi(@RequestBody MuracaatBilgi muracaatBilgi) {
        return muracaatBilgiService.createMuracaatBilgi(muracaatBilgi);
    }

    @PutMapping("/{id}")
    public MuracaatBilgi updateMuracaatBilgi(@PathVariable Integer id, @RequestBody MuracaatBilgi muracaatBilgi) {
        return muracaatBilgiService.updateMuracaatBilgi(id, muracaatBilgi);
    }

    @DeleteMapping("/{id}")
    public void deleteMuracaatBilgi(@PathVariable Integer id) {
        muracaatBilgiService.deleteMuracaatBilgi(id);
    }
}
