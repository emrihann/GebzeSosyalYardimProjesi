/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakGelirRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakGelirServiceImpl implements TutanakGelirService {
       private TutanakGelirRepository tutanakGelirRepository;

    @Autowired
    public TutanakGelirServiceImpl(TutanakGelirRepository tutanakGelirRepository) {
        
    }

    @Override
    public List<TutanakGelir> findAll() {
        return tutanakGelirRepository.findAll();
    }

    @Override
    public Optional<TutanakGelir> findById(Integer id) {
        return tutanakGelirRepository.findById(id);
    }

    @Override
    public TutanakGelir save(TutanakGelir tutanakGelir) {
        return tutanakGelirRepository.save(tutanakGelir);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakGelirRepository.deleteById(id);
    }
}
