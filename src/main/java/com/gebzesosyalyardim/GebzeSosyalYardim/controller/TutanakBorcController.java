/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakBorcService;
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
@RequestMapping("/api/tutanakborc")
public class TutanakBorcController {
     @Autowired
    private TutanakBorcService tutanakBorcService;

    @GetMapping
    public List<TutanakBorc> getAllTutanakBorc() {
        return tutanakBorcService.getAllTutanakBorc();
    }

    @GetMapping("/{id}")
    public Optional<TutanakBorc> getTutanakBorcById(@PathVariable Integer id) {
        return tutanakBorcService.getTutanakBorcById(id);
    }

    @PostMapping
    public TutanakBorc createTutanakBorc(@RequestBody TutanakBorc tutanakBorc) {
        return tutanakBorcService.createTutanakBorc(tutanakBorc);
    }

    @PutMapping("/{id}")
    public TutanakBorc updateTutanakBorc(@PathVariable Integer id, @RequestBody TutanakBorc tutanakBorc) {
        return tutanakBorcService.updateTutanakBorc(id, tutanakBorc);
    }

    @DeleteMapping("/{id}")
    public void deleteTutanakBorc(@PathVariable Integer id) {
        tutanakBorcService.deleteTutanakBorc(id);
    }
    
}
