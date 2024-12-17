/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakMulkiyetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakMulkiyetServiceImpl implements TutanakMulkiyetService {
       @Autowired
    private TutanakMulkiyetRepository repository;

    @Override
    public List<TutanakMulkiyet> getAll() {
        return repository.findAll();
    }

    @Override
    public TutanakMulkiyet getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mülkiyet kaydı bulunamadı: " + id));
    }

    @Override
    public TutanakMulkiyet save(TutanakMulkiyet tutanakMulkiyet) {
        return repository.save(tutanakMulkiyet);
    }

    @Override
    public TutanakMulkiyet update(Long id, TutanakMulkiyet tutanakMulkiyet) {
        TutanakMulkiyet existingRecord = getById(id);
        tutanakMulkiyet.setMulkiyetId(existingRecord.getMulkiyetId());
        return repository.save(tutanakMulkiyet);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
