/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakSosyalGuvence;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakSosyalGuvenceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakSosyalGuvenceServiceImpl implements TutanakSosyalGuvenceService{
     private TutanakSosyalGuvenceRepository tutanakSosyalGuvenceRepository;

    @Autowired
    public TutanakSosyalGuvenceServiceImpl(TutanakSosyalGuvenceRepository tutanakSosyalGuvenceRepository) {
      
    }

    @Override
    public List<TutanakSosyalGuvence> findAll() {
        return tutanakSosyalGuvenceRepository.findAll();
    }

    @Override
    public Optional<TutanakSosyalGuvence> findById(Integer id) {
        return tutanakSosyalGuvenceRepository.findById(id);
    }

    @Override
    public TutanakSosyalGuvence save(TutanakSosyalGuvence tutanakSosyalGuvence) {
        return tutanakSosyalGuvenceRepository.save(tutanakSosyalGuvence);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakSosyalGuvenceRepository.deleteById(id);
    }
}
