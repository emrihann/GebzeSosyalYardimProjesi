/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiAskerlikRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiAskerlikServiceImpl implements KisiAskerlikService {
      @Autowired
    private KisiAskerlikRepository repository;

    @Override
    public List<KisiAskerlik> getAll() {
        return repository.findAll();
    }

    @Override
    public KisiAskerlik getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kayıt bulunamadı: " + id));
    }

    @Override
    public KisiAskerlik save(KisiAskerlik kisiAskerlik) {
        return repository.save(kisiAskerlik);
    }

    @Override
    public KisiAskerlik update(Long id, KisiAskerlik kisiAskerlik) {
        KisiAskerlik existingRecord = getById(id);
        kisiAskerlik.setAskerlikId(existingRecord.getAskerlikId());
        return repository.save(kisiAskerlik);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
