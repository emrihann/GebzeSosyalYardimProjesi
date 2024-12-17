/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Guvence;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.GuvenceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class GuvenceServiceImpl implements GuvenceService {
    private final GuvenceRepository guvenceRepository;

    @Autowired
    public GuvenceServiceImpl(GuvenceRepository guvenceRepository) {
        this.guvenceRepository = guvenceRepository;
    }

    @Override
    public List<Guvence> getAllGuvence() {
        return guvenceRepository.findAll();
    }

    @Override
    public Optional<Guvence> getGuvenceById(Long id) {
        return guvenceRepository.findById(id);
    }

    @Override
    public Guvence saveGuvence(Guvence guvence) {
        return guvenceRepository.save(guvence);
    }

    @Override
    public Guvence updateGuvence(Long id, Guvence guvence) {
        if (guvenceRepository.existsById(id)) {
            guvence.setGuvenceId(id);
            return guvenceRepository.save(guvence);
        }
        return null; // Id bulunmazsa null döndürülür
    }

    @Override
    public void deleteGuvence(Long id) {
        guvenceRepository.deleteById(id);
    }
}
