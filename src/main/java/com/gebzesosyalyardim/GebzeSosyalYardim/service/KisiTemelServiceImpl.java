/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiTemel;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiTemelRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiTemelServiceImpl implements KisiTemelService {
      private final KisiTemelRepository kisiTemelRepository;

    @Autowired
    public KisiTemelServiceImpl(KisiTemelRepository kisiTemelRepository) {
        this.kisiTemelRepository = kisiTemelRepository;
    }

    @Override
    public List<KisiTemel> getAllKisiTemel() {
        return kisiTemelRepository.findAll();
    }

    @Override
    public Optional<KisiTemel> getKisiTemelById(Long kisiId) {
        return kisiTemelRepository.findById(kisiId);
    }

    @Override
    public KisiTemel saveKisiTemel(KisiTemel kisiTemel) {
        return kisiTemelRepository.save(kisiTemel);
    }

    @Override
    public KisiTemel updateKisiTemel(Long kisiId, KisiTemel kisiTemel) {
        if(kisiTemelRepository.existsById(kisiId)) {
            kisiTemel.setKisiId(kisiId);
            return kisiTemelRepository.save(kisiTemel);
        }
        return null;
    }

    @Override
    public void deleteKisiTemel(Long kisiId) {
        kisiTemelRepository.deleteById(kisiId);
    }
}
