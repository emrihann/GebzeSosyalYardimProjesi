/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAdres;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiAdresRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author emirh
 */
@Service
public class KisiAdresServiceImpl implements KisiAdresService {
 @Autowired
    private KisiAdresRepository kisiAdresRepository;

    @Override
    public List<KisiAdres> getAllKisiAdres() {
        return kisiAdresRepository.findAll();
    }

    @Override
    public Optional<KisiAdres> getKisiAdresById(Integer id) {
        return kisiAdresRepository.findById(id);
    }

    @Override
    public KisiAdres createKisiAdres(KisiAdres kisiAdres) {
        return kisiAdresRepository.save(kisiAdres);
    }

    @Override
    public KisiAdres updateKisiAdres(Integer id, KisiAdres kisiAdres) {
        if (kisiAdresRepository.existsById(id)) {
            kisiAdres.setKisi_adres_id(id);
            return kisiAdresRepository.save(kisiAdres);
        } else {
            throw new RuntimeException("Adres bulunamadı.");
        }
    }

    @Override
    public void deleteKisiAdres(Integer id) {
        kisiAdresRepository.deleteById(id);
    }
}
