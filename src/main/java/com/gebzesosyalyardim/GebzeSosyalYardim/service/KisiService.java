/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service

public class KisiService {
  private final KisiRepository kisiRepository;

    @Autowired
    public KisiService(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }

    // Yeni kişi kaydetme
    public Kisi saveKisi(Kisi kisi) {
        return kisiRepository.save(kisi);
    }

    // Tüm kişileri getirme
    public List<Kisi> getAllKisiler() {
        return kisiRepository.findAll();
    }

    // ID'ye göre kişi getirme
    public Optional<Kisi> getKisiById(Integer id) {
        return kisiRepository.findById(id);
    }

    // Kimlik numarasına göre kişi bulma
    public Kisi getKisiByKimlikNo(BigDecimal kimlikNo) {
        return kisiRepository.findByKimlikNo(kimlikNo);
    }

    // Kişiyi güncelleme
    public Kisi updateKisi(Kisi kisi) {
        return kisiRepository.save(kisi);
    }

    // ID'ye göre kişi silme
    public void deleteKisiById(Integer id) {
        kisiRepository.deleteById(id);
    }
    
}
