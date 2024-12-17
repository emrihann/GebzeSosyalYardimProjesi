/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiDetayRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiDetayServiceImpl implements KisiDetayService {
     private final KisiDetayRepository kisiDetayRepository;

    public KisiDetayServiceImpl(KisiDetayRepository kisiDetayRepository) {
        this.kisiDetayRepository = kisiDetayRepository;
    }

    @Override
    public List<KisiDetay> findAll() {
        return kisiDetayRepository.findAll();
    }

    @Override
    public Optional<KisiDetay> findById(Long id) {
        return kisiDetayRepository.findById(id);
    }

    @Override
    public KisiDetay save(KisiDetay kisiDetay) {
        return kisiDetayRepository.save(kisiDetay);
    }

    @Override
    public void deleteById(Long id) {
        kisiDetayRepository.deleteById(id);
    }
}
