/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEgitimDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiEgitimDurumRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiEgitimDurumServiceImpl implements KisiEgitimDurumService {
    private final KisiEgitimDurumRepository kisiEgitimDurumRepository;

    @Autowired
    public KisiEgitimDurumServiceImpl(KisiEgitimDurumRepository kisiEgitimDurumRepository) {
        this.kisiEgitimDurumRepository = kisiEgitimDurumRepository;
    }

    @Override
    public List<KisiEgitimDurum> getAllKisiEgitimDurum() {
        return kisiEgitimDurumRepository.findAll();
    }

    @Override
    public Optional<KisiEgitimDurum> getKisiEgitimDurumById(Long id) {
        return kisiEgitimDurumRepository.findById(id);
    }

    @Override
    public KisiEgitimDurum saveKisiEgitimDurum(KisiEgitimDurum kisiEgitimDurum) {
        return kisiEgitimDurumRepository.save(kisiEgitimDurum);
    }

    @Override
    public KisiEgitimDurum updateKisiEgitimDurum(Long id, KisiEgitimDurum kisiEgitimDurum) {
        if (kisiEgitimDurumRepository.existsById(id)) {
            kisiEgitimDurum.setEgitimDurumId(id);
            return kisiEgitimDurumRepository.save(kisiEgitimDurum);
        }
        return null; // ID bulunmazsa null döndürülür.
    }

    @Override
    public void deleteKisiEgitimDurum(Long id) {
        kisiEgitimDurumRepository.deleteById(id);
    }
}
