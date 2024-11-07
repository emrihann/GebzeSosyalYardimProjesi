/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakYakacak;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakYakacakRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakYakacakServiceImpl implements TutanakYakacakService {
     private TutanakYakacakRepository tutanakYakacakRepository;

    @Autowired
    public TutanakYakacakServiceImpl(TutanakYakacakRepository tutanakYakacakRepository) {
        this.tutanakYakacakRepository = tutanakYakacakRepository;
    }

    @Override
    public List<TutanakYakacak> findAll() {
        return tutanakYakacakRepository.findAll();
    }

    @Override
    public Optional<TutanakYakacak> findById(Integer id) {
        return tutanakYakacakRepository.findById(id);
    }

    @Override
    public TutanakYakacak save(TutanakYakacak tutanakYakacak) {
        return tutanakYakacakRepository.save(tutanakYakacak);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakYakacakRepository.deleteById(id);
    }
}
