/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakBorcRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author emirh
 */
@Service
public class TutanakBorcServiceImpl implements TutanakBorcService {
    @Autowired
    private TutanakBorcRepository tutanakBorcRepository;

    @Override
    public List<TutanakBorc> getAllTutanakBorc() {
        return tutanakBorcRepository.findAll();
    }

    @Override
    public Optional<TutanakBorc> getTutanakBorcById(Integer id) {
        return tutanakBorcRepository.findById(id);
    }

    @Override
    public TutanakBorc createTutanakBorc(TutanakBorc tutanakBorc) {
        return tutanakBorcRepository.save(tutanakBorc);
    }

    @Override
    public TutanakBorc updateTutanakBorc(Integer id, TutanakBorc tutanakBorc) {
        if (tutanakBorcRepository.existsById(id)) {
            tutanakBorc.setBorcId(id);
            return tutanakBorcRepository.save(tutanakBorc);
        }
        return null;
    }

    @Override
    public void deleteTutanakBorc(Integer id) {
        tutanakBorcRepository.deleteById(id);
    }

   
}
