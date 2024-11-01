/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatYardimTalep;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatYardimTalepRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author emirh
 */
@Service
public class MuracaatYardimTalepServiceImpl implements MuracaatYardimTalepService  {
     @Autowired
    private MuracaatYardimTalepRepository muracaatYardimTalepRepository;

    @Override
    public List<MuracaatYardimTalep> getAllMuracaatYardimTalep() {
        return muracaatYardimTalepRepository.findAll();
    }

    @Override
    public Optional<MuracaatYardimTalep> getMuracaatYardimTalepById(Integer id) {
        return muracaatYardimTalepRepository.findById(id);
    }

    @Override
    public MuracaatYardimTalep createMuracaatYardimTalep(MuracaatYardimTalep muracaatYardimTalep) {
        return muracaatYardimTalepRepository.save(muracaatYardimTalep);
    }

    @Override
    public MuracaatYardimTalep updateMuracaatYardimTalep(Integer id, MuracaatYardimTalep muracaatYardimTalep) {
        if (muracaatYardimTalepRepository.existsById(id)) {
            muracaatYardimTalep.setTalepId(id);
            return muracaatYardimTalepRepository.save(muracaatYardimTalep);
        }
        return null;
    }

    @Override
    public void deleteMuracaatYardimTalep(Integer id) {
        muracaatYardimTalepRepository.deleteById(id);
    }
}
