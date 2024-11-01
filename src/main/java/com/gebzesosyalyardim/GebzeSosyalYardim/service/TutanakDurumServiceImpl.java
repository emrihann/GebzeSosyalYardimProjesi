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
      @Autowired
    private TutanakDurumRepository tutanakDurumRepository;

    @Override
    public List<TutanakDurum> getAllTutanakDurum() {
        return tutanakDurumRepository.findAll();
    }

    @Override
    public TutanakDurum getTutanakDurumById(Integer id) {
        return tutanakDurumRepository.findById(id).orElse(null);
    }

    @Override
    public TutanakDurum createTutanakDurum(TutanakDurum tutanakDurum) {
        return tutanakDurumRepository.save(tutanakDurum);
    }

    @Override
    public TutanakDurum updateTutanakDurum(Integer id, TutanakDurum tutanakDurum) {
        Optional<TutanakDurum> existingTutanakDurum = tutanakDurumRepository.findById(id);
        if (existingTutanakDurum.isPresent()) {
            TutanakDurum updatedTutanakDurum = existingTutanakDurum.get();
            updatedTutanakDurum.setTutanakIsim(tutanakDurum.getTutanakIsim());
            updatedTutanakDurum.setAktiflik(tutanakDurum.getAktiflik());
            return tutanakDurumRepository.save(updatedTutanakDurum);
        }
        return null;
    }

    @Override
    public void deleteTutanakDurum(Integer id) {
        tutanakDurumRepository.deleteById(id);
    }
}
