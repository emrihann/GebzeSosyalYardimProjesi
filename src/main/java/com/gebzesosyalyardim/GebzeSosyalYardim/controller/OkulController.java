/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Okul;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.OkulService;
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
@RequestMapping("/api/okullar")
public class OkulController {
    private final OkulService okulService;

    @Autowired
    public OkulController(OkulService okulService) {
        this.okulService = okulService;
    }

    @PostMapping
    public Okul createOkul(@RequestBody Okul okul) {
        return okulService.saveOkul(okul);
    }

    @GetMapping("/{id}")
    public Okul getOkulById(@PathVariable Long id) {
        return okulService.getOkulById(id);
    }

    @GetMapping
    public List<Okul> getAllOkullar() {
        return okulService.getAllOkullar();
    }

    @DeleteMapping("/{id}")
    public void deleteOkul(@PathVariable Long id) {
        okulService.deleteOkul(id);
    }
}
