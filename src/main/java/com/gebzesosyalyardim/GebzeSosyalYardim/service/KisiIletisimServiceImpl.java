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
     @Autowired
    private KisiIletisimRepository kisiIletisimRepository;

    @Override
    public List<KisiIletisim> getAllKisiIletisim() {
        return kisiIletisimRepository.findAll();
    }

    @Override
    public Optional<KisiIletisim> getKisiIletisimById(Integer id) {
        return kisiIletisimRepository.findById(id);
    }

    @Override
    public KisiIletisim createKisiIletisim(KisiIletisim kisiIletisim) {
        return kisiIletisimRepository.save(kisiIletisim);
    }

    @Override
    public KisiIletisim updateKisiIletisim(Integer id, KisiIletisim kisiIletisim) {
        kisiIletisim.setKisi_iletisim_id(id);
        return kisiIletisimRepository.save(kisiIletisim);
    }

    @Override
    public void deleteKisiIletisim(Integer id) {
        kisiIletisimRepository.deleteById(id);
    }
}
