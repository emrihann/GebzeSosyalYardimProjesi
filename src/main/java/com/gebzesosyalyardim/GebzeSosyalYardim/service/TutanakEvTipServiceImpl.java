/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvTipRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakEvTipServiceImpl implements TutanakEvTipService {
    private TutanakEvTipRepository tutanakEvTipRepository ;

    @Autowired
    public TutanakEvTipServiceImpl(TutanakEvTipRepository tutanakEvTipRepository) {
       
    }

    @Override
    public List<TutanakEvTip> findAll() {
        return tutanakEvTipRepository.findAll();
    }

    @Override
    public Optional<TutanakEvTip> findById(Integer id) {
        return tutanakEvTipRepository.findById(id);
    }

    @Override
    public TutanakEvTip save(TutanakEvTip tutanakEvTip) {
        return tutanakEvTipRepository.save(tutanakEvTip);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakEvTipRepository.deleteById(id);
    }
}
