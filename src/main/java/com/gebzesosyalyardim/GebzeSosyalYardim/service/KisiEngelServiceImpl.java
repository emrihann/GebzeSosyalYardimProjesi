/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEngel;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiEngelRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiEngelServiceImpl implements KisiEngelService {
     @Autowired
    private KisiEngelRepository kisiEngelRepository;

    @Override
    public List<KisiEngel> getAllKisiEngel() {
        return kisiEngelRepository.findAll();
    }

    @Override
    public Optional<KisiEngel> getKisiEngelById(Integer id) {
        return kisiEngelRepository.findById(id);
    }

    @Override
    public KisiEngel createKisiEngel(KisiEngel kisiEngel) {
        return kisiEngelRepository.save(kisiEngel);
    }

    @Override
    public KisiEngel updateKisiEngel(Integer id, KisiEngel kisiEngel) {
        kisiEngel.setKisi_engel_id(id);
        return kisiEngelRepository.save(kisiEngel);
    }

    @Override
    public void deleteKisiEngel(Integer id) {
        kisiEngelRepository.deleteById(id);
    } 
}
