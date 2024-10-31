/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlar;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiYakinlarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiYakinlarServiceImpl implements KisiYakinlarService {
     @Autowired
    private KisiYakinlarRepository kisiYakinlarRepository;

    @Override
    public List<KisiYakinlar> getAllKisiYakinlar() {
        return kisiYakinlarRepository.findAll();
    }

    @Override
    public Optional<KisiYakinlar> getKisiYakinlarById(Integer id) {
        return kisiYakinlarRepository.findById(id);
    }

    @Override
    public KisiYakinlar createKisiYakinlar(KisiYakinlar kisiYakinlar) {
        return kisiYakinlarRepository.save(kisiYakinlar);
    }

    @Override
    public KisiYakinlar updateKisiYakinlar(Integer id, KisiYakinlar kisiYakinlar) {
        kisiYakinlar.setYakinlar_id(id);
        return kisiYakinlarRepository.save(kisiYakinlar);
    }

    @Override
    public void deleteKisiYakinlar(Integer id) {
        kisiYakinlarRepository.deleteById(id);
    }
}
