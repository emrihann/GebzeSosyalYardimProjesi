/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatDurumRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class MuracaatDurumServiceImpl implements MuracaatDurumService {
    @Autowired
    private MuracaatDurumRepository muracaatDurumRepository;

    @Override
    public List<MuracaatDurum> getAllMuracaatDurum() {
        return muracaatDurumRepository.findAll();
    }

    @Override
    public Optional<MuracaatDurum> getMuracaatDurumById(Integer id) {
        return muracaatDurumRepository.findById(id);
    }

    @Override
    public MuracaatDurum createMuracaatDurum(MuracaatDurum muracaatDurum) {
        return muracaatDurumRepository.save(muracaatDurum);
    }

    @Override
    public MuracaatDurum updateMuracaatDurum(Integer id, MuracaatDurum muracaatDurum) {
        if (muracaatDurumRepository.existsById(id)) {
            muracaatDurum.setDurumId(id);
            return muracaatDurumRepository.save(muracaatDurum);
        }
        return null;
    }

    @Override
    public void deleteMuracaatDurum(Integer id) {
        muracaatDurumRepository.deleteById(id);
    }
}
