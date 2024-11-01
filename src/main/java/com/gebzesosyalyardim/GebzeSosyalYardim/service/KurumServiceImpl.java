/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KurumRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KurumServiceImpl implements KurumService {
     @Autowired
    private KurumRepository kurumRepository;

    @Override
    public List<Kurum> getAllKurum() {
        return kurumRepository.findAll();
    }

    @Override
    public Optional<Kurum> getKurumById(Integer id) {
        return kurumRepository.findById(id);
    }

    @Override
    public Kurum createKurum(Kurum kurum) {
        return kurumRepository.save(kurum);
    }

    @Override
    public Kurum updateKurum(Integer id, Kurum kurum) {
        if (kurumRepository.existsById(id)) {
            kurum.setKurumId(id);
            return kurumRepository.save(kurum);
        }
        return null; // or throw an exception
    }

    @Override
    public void deleteKurum(Integer id) {
        kurumRepository.deleteById(id);
    }
}
