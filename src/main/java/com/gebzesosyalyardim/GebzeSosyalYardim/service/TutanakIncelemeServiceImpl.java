/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakMulkiyetRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
public class TutanakIncelemeServiceImpl {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author emirh
 */
@Service
public class TutanakMulkiyetServiceImpl implements TutanakMulkiyetService {
       private TutanakMulkiyetRepository tutanakMulkiyetRepository;

    @Autowired
    public TutanakMulkiyetServiceImpl(TutanakMulkiyetRepository tutanakMulkiyetRepository) {
        this.tutanakMulkiyetRepository = tutanakMulkiyetRepository;
    }

    @Override
    public List<TutanakMulkiyet> findAll() {
        return tutanakMulkiyetRepository.findAll();
    }

    @Override
    public Optional<TutanakMulkiyet> findById(Integer id) {
        return tutanakMulkiyetRepository.findById(id);
    }

    @Override
    public TutanakMulkiyet save(TutanakMulkiyet tutanakMulkiyet) {
        return tutanakMulkiyetRepository.save(tutanakMulkiyet);
    }

    @Override
    public void deleteById(Integer id) {
        tutanakMulkiyetRepository.deleteById(id);
    }
}

    
}
