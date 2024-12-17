/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiIletisim;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiIletisimRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiIletisimServiceImpl implements KisiIletisimService {
     private final KisiIletisimRepository kisiIletisimRepository;

    @Autowired
    public KisiIletisimServiceImpl(KisiIletisimRepository kisiIletisimRepository) {
        this.kisiIletisimRepository = kisiIletisimRepository;
    }

    @Override
    public List<KisiIletisim> getAllKisiIletisim() {
        return kisiIletisimRepository.findAll();
    }

    @Override
    public Optional<KisiIletisim> getKisiIletisimById(Long id) {
        return kisiIletisimRepository.findById(id);
    }

    @Override
    public KisiIletisim saveKisiIletisim(KisiIletisim kisiIletisim) {
        return kisiIletisimRepository.save(kisiIletisim);
    }

    @Override
    public KisiIletisim updateKisiIletisim(Long id, KisiIletisim kisiIletisim) {
        if (kisiIletisimRepository.existsById(id)) {
            kisiIletisim.setKisiIletisimId(id);
            return kisiIletisimRepository.save(kisiIletisim);
        }
        return null;
    }

    @Override
    public void deleteKisiIletisim(Long id) {
        kisiIletisimRepository.deleteById(id);
    }
}
