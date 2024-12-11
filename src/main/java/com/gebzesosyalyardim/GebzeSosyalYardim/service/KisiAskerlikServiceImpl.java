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
public class KisiAskerlikServiceImpl implements KisiAskerlikService {
    @Autowired
    private KisiAskerlikRepository kisiAskerlikRepository;

    @Override
    public List<KisiAskerlik> getAllKisiAskerlik() {
        return kisiAskerlikRepository.findAll();
    }

    @Override
    public Optional<KisiAskerlik> getKisiAskerlikById(Integer id) {
        return kisiAskerlikRepository.findById(id);
    }

    @Override
    public KisiAskerlik createKisiAskerlik(KisiAskerlik kisiAskerlik) {
        return kisiAskerlikRepository.save(kisiAskerlik);
    }

    @Override
    public KisiAskerlik updateKisiAskerlik(Integer id, KisiAskerlik kisiAskerlik) {
        if (kisiAskerlikRepository.existsById(id)) {
            kisiAskerlik.setAskerlik_id(id);
            return kisiAskerlikRepository.save(kisiAskerlik);
        } else {
            throw new RuntimeException("Askerlik kaydı bulunamadı.");
        }
    }

    @Override
    public void deleteKisiAskerlik(Integer id) {
        kisiAskerlikRepository.deleteById(id);
    }
}