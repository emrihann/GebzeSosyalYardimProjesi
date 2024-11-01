/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Muracaat;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class MuracaatServiceImpl implements MuracaatService {
     @Autowired
    private MuracaatRepository muracaatRepository;

    @Override
    public List<Muracaat> getAllMuracaat() {
        return muracaatRepository.findAll();
    }

    @Override
    public Optional<Muracaat> getMuracaatById(Integer id) {
        return muracaatRepository.findById(id);
    }

    @Override
    public Muracaat createMuracaat(Muracaat muracaat) {
        return muracaatRepository.save(muracaat);
    }

    @Override
    public Muracaat updateMuracaat(Integer id, Muracaat muracaat) {
        if (muracaatRepository.existsById(id)) {
            muracaat.setMuracaatId(id);
            return muracaatRepository.save(muracaat);
        }
        return null; // or throw an exception
    }

    @Override
    public void deleteMuracaat(Integer id) {
        muracaatRepository.deleteById(id);
    }
}
