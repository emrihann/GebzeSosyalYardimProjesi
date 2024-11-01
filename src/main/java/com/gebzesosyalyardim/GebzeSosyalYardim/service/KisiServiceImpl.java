/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiServiceImpl implements KisiService {
     @Autowired
    private KisiRepository kisiRepository;

    @Override
    public List<Kisi> getAllKisi() {
        return kisiRepository.findAll();
    }

    @Override
    public Optional<Kisi> getKisiById(Integer id) {
        return kisiRepository.findById(id);
    }

    @Override
    public Kisi createKisi(Kisi kisi) {
        return kisiRepository.save(kisi);
    }

    @Override
    public Kisi updateKisi(Integer id, Kisi kisi) {
        if (kisiRepository.existsById(id)) {
            kisi.setKisi_id(id);
            return kisiRepository.save(kisi);
        }
        return null;
    }

    @Override
    public void deleteKisi(Integer id) {
        kisiRepository.deleteById(id);
    }
}
