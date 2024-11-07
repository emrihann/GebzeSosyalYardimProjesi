/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvEsyalari;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvEsyalariRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakEvEsyalariServiceImpl implements TutanakEvEsyalariService{
       private TutanakEvEsyalariRepository tutanakEvEsyalariRepository;

    @Autowired
    public TutanakEvEsyalariServiceImpl(TutanakEvEsyalariRepository tutanakEvEsyalariRepository) {
        this.tutanakEvEsyalariRepository = tutanakEvEsyalariRepository;
    }

    @Override
    public List<TutanakEvEsyalari> findAll() {
        return tutanakEvEsyalariRepository.findAll();
    }

    @Override
    public Optional<TutanakEvEsyalari> findById(Integer id) {
        return tutanakEvEsyalariRepository.findById(id);
    }

    @Override
    public TutanakEvEsyalari save(TutanakEvEsyalari tutanakEvEsyalari) {
        return tutanakEvEsyalariRepository.save(tutanakEvEsyalari);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakEvEsyalariRepository.deleteById(id);
    }
}
