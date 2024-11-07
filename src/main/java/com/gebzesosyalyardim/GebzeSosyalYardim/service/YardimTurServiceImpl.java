/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimTur;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimTurRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class YardimTurServiceImpl implements YardimTurService {
     @Autowired
    private YardimTurRepository yardimTurRepository;

    @Override
    public YardimTur saveYardimTur(YardimTur yardimTur) {
        return yardimTurRepository.save(yardimTur);
    }

    @Override
    public Optional<YardimTur> getYardimTurById(int id) {
        return yardimTurRepository.findById(id);
    }

    @Override
    public List<YardimTur> getAllYardimTurler() {
        return yardimTurRepository.findAll();
    }

    @Override
    public YardimTur updateYardimTur(YardimTur yardimTur) {
        return yardimTurRepository.save(yardimTur);
    }

    @Override
    public void deleteYardimTur(int id) {
        yardimTurRepository.deleteById(id);
    } 
}
