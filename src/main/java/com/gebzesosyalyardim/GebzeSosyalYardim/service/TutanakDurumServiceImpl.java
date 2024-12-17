/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakDurumRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakDurumServiceImpl implements TutanakDurumService {
       private final TutanakDurumRepository tutanakDurumRepository;

    @Autowired
    public TutanakDurumServiceImpl(TutanakDurumRepository tutanakDurumRepository) {
        this.tutanakDurumRepository = tutanakDurumRepository;
    }

    @Override
    public List<TutanakDurum> getAllTutanakDurum() {
        return tutanakDurumRepository.findAll();
    }

    @Override
    public Optional<TutanakDurum> getTutanakDurumById(Long id) {
        return tutanakDurumRepository.findById(id);
    }

    @Override
    public TutanakDurum saveTutanakDurum(TutanakDurum tutanakDurum) {
        return tutanakDurumRepository.save(tutanakDurum);
    }

    @Override
    public TutanakDurum updateTutanakDurum(Long id, TutanakDurum tutanakDurum) {
        if (tutanakDurumRepository.existsById(id)) {
            tutanakDurum.setDurumId(id);
            return tutanakDurumRepository.save(tutanakDurum);
        }
        return null; // Id bulunmazsa null döndürülür
    }

    @Override
    public void deleteTutanakDurum(Long id) {
        tutanakDurumRepository.deleteById(id);
    }
}
