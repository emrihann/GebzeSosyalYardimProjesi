/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.EngelliTipService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/engelli-tip")
public class EngelliTipController {
       private final EngelliTipService engelliTipService;

    @Autowired
    public EngelliTipController(EngelliTipService engelliTipService) {
        this.engelliTipService = engelliTipService;
    }

    @PostMapping
    public ResponseEntity<EngelliTip> createEngelliTip(@RequestBody EngelliTip engelliTip) {
        EngelliTip savedEngelliTip = engelliTipService.save(engelliTip);
        return ResponseEntity.ok(savedEngelliTip);
    }

    @GetMapping
    public ResponseEntity<List<EngelliTip>> getAllEngelliTips() {
        List<EngelliTip> engelliTips = engelliTipService.findAll();
        return ResponseEntity.ok(engelliTips);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EngelliTip> getEngelliTipById(@PathVariable Long id) {
        EngelliTip engelliTip = engelliTipService.findById(id);
        if (engelliTip != null) {
            return ResponseEntity.ok(engelliTip);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEngelliTip(@PathVariable Long id) {
        engelliTipService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
