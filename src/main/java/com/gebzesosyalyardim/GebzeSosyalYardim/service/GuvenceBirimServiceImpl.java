/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.GuvenceBirim;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.GuvenceBirimRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class GuvenceBirimServiceImpl implements GuvenceBirimService {
     private final GuvenceBirimRepository guvenceBirimRepository;

    @Autowired
    public GuvenceBirimServiceImpl(GuvenceBirimRepository guvenceBirimRepository) {
        this.guvenceBirimRepository = guvenceBirimRepository;
    }

    @Override
    public List<GuvenceBirim> getAllGuvenceBirim() {
        return guvenceBirimRepository.findAll();
    }

    @Override
    public Optional<GuvenceBirim> getGuvenceBirimById(Long id) {
        return guvenceBirimRepository.findById(id);
    }

    @Override
    public GuvenceBirim saveGuvenceBirim(GuvenceBirim guvenceBirim) {
        return guvenceBirimRepository.save(guvenceBirim);
    }

    @Override
    public GuvenceBirim updateGuvenceBirim(Long id, GuvenceBirim guvenceBirim) {
        if (guvenceBirimRepository.existsById(id)) {
            guvenceBirim.setBirimId(id);
            return guvenceBirimRepository.save(guvenceBirim);
        }
        return null; // Id bulunmazsa null döndürülür
    }

    @Override
    public void deleteGuvenceBirim(Long id) {
        guvenceBirimRepository.deleteById(id);
    }
}
