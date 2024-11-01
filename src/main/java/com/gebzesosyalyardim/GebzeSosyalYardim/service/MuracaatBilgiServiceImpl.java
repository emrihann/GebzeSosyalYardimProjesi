/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatBilgi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatBilgiRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author emirh
 */
@Service
public class MuracaatBilgiServiceImpl implements MuracaatBilgiService {
       @Autowired
    private MuracaatBilgiRepository muracaatBilgiRepository;

    @Override
    public List<MuracaatBilgi> getAllMuracaatBilgi() {
        return muracaatBilgiRepository.findAll();
    }

    @Override
    public Optional<MuracaatBilgi> getMuracaatBilgiById(Integer id) {
        return muracaatBilgiRepository.findById(id);
    }

    @Override
    public MuracaatBilgi createMuracaatBilgi(MuracaatBilgi muracaatBilgi) {
        return muracaatBilgiRepository.save(muracaatBilgi);
    }

    @Override
    public MuracaatBilgi updateMuracaatBilgi(Integer id, MuracaatBilgi muracaatBilgi) {
        if (muracaatBilgiRepository.existsById(id)) {
            muracaatBilgi.setMuracaatBilgiId(id);
            return muracaatBilgiRepository.save(muracaatBilgi);
        }
        return null;
    }

    @Override
    public void deleteMuracaatBilgi(Integer id) {
        muracaatBilgiRepository.deleteById(id);
    }
}
