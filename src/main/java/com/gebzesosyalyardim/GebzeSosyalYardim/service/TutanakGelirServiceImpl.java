/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakGelirRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakGelirServiceImpl implements TutanakGelirService {
      @Autowired
    private TutanakGelirRepository repository;

    @Override
    public List<TutanakGelir> getAll() {
        return repository.findAll();
    }

    @Override
    public TutanakGelir getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gelir kaydı bulunamadı: " + id));
    }

    @Override
    public TutanakGelir save(TutanakGelir tutanakGelir) {
        return repository.save(tutanakGelir);
    }

    @Override
    public TutanakGelir update(Long id, TutanakGelir tutanakGelir) {
        TutanakGelir existingRecord = getById(id);
        tutanakGelir.setGelirId(existingRecord.getGelirId());
        return repository.save(tutanakGelir);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
