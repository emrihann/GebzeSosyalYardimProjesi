/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiAskerlikRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiAskerlikService {
     private final KisiAskerlikRepository kisiAskerlikRepository;

    @Autowired
    public KisiAskerlikService(KisiAskerlikRepository kisiAskerlikRepository) {
        this.kisiAskerlikRepository = kisiAskerlikRepository;
    }

    // KisiAskerlik ekleme
    public KisiAskerlik saveKisiAskerlik(KisiAskerlik kisiAskerlik) {
        return kisiAskerlikRepository.save(kisiAskerlik);
    }

    // KisiAskerlik listeleme
    public List<KisiAskerlik> getAllKisiAskerlik() {
        return kisiAskerlikRepository.findAll();
    }

    // KisiAskerlik id ile bulma
    public Optional<KisiAskerlik> getKisiAskerlikById(Integer askerlikId) {
        return kisiAskerlikRepository.findById(askerlikId);
    }

    // KisiAskerlik güncelleme
    public KisiAskerlik updateKisiAskerlik(Integer askerlikId, KisiAskerlik updatedKisiAskerlik) {
        if (kisiAskerlikRepository.existsById(askerlikId)) {
            updatedKisiAskerlik.setAskerlik_id(askerlikId);
            return kisiAskerlikRepository.save(updatedKisiAskerlik);
        }
        return null; // ID bulunamadıysa null döner
    }

    // KisiAskerlik silme
    public boolean deleteKisiAskerlik(Integer askerlikId) {
        if (kisiAskerlikRepository.existsById(askerlikId)) {
            kisiAskerlikRepository.deleteById(askerlikId);
            return true;
        }
        return false; // ID bulunamadıysa false döner
    }
}
