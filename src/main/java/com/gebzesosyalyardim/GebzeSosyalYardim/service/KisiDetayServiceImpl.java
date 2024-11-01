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
public class KisiDetayServiceImpl implements KisiDetayService{
    @Autowired
    private KisiDetayRepository kisiDetayRepository;

    @Override
    public List<KisiDetay> getAllKisiDetay() {
        return kisiDetayRepository.findAll();
    }

    @Override
    public Optional<KisiDetay> getKisiDetayById(Integer id) {
        return kisiDetayRepository.findById(id);
    }

    @Override
    public KisiDetay createKisiDetay(KisiDetay kisiDetay) {
        return kisiDetayRepository.save(kisiDetay);
    }

    @Override
    public KisiDetay updateKisiDetay(Integer id, KisiDetay kisiDetay) {
        if (kisiDetayRepository.existsById(id)) {
            kisiDetay.setDetayId(id);
            return kisiDetayRepository.save(kisiDetay);
        }
        return null; // Eğer kayıt bulunamazsa null döner
    }

    @Override
    public void deleteKisiDetay(Integer id) {
        kisiDetayRepository.deleteById(id);
    }
}
