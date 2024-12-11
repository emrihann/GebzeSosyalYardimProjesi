/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiDetayRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiDetayService {
     private final KisiDetayRepository kisiDetayRepository;

    @Autowired
    public KisiDetayService(KisiDetayRepository kisiDetayRepository) {
        this.kisiDetayRepository = kisiDetayRepository;
    }

    // KisiDetay ekleme
    public KisiDetay saveKisiDetay(KisiDetay kisiDetay) {
        return kisiDetayRepository.save(kisiDetay);
    }

    // Tüm KisiDetay'ları listeleme
    public List<KisiDetay> getAllKisiDetay() {
        return kisiDetayRepository.findAll();
    }

    // KisiDetay id ile bulma
    public Optional<KisiDetay> getKisiDetayById(Integer detayId) {
        return kisiDetayRepository.findById(detayId);
    }

    // KisiDetay güncelleme
    public KisiDetay updateKisiDetay(Integer detayId, KisiDetay updatedKisiDetay) {
        if (kisiDetayRepository.existsById(detayId)) {
            updatedKisiDetay.setDetayId(detayId);
            return kisiDetayRepository.save(updatedKisiDetay);
        }
        return null; // ID bulunamadıysa null döner
    }

    // KisiDetay silme
    public boolean deleteKisiDetay(Integer detayId) {
        if (kisiDetayRepository.existsById(detayId)) {
            kisiDetayRepository.deleteById(detayId);
            return true;
        }
        return false; // ID bulunamadıysa false döner
    }
}
