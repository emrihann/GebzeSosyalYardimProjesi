/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yardim;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class YardimServiceImpl implements YardimService{
      @Autowired
    private YardimRepository yardimRepository;

    @Override
    public Yardim saveYardim(Yardim yardim) {
        return yardimRepository.save(yardim);
    }

    @Override
    public Optional<Yardim> getYardimById(int id) {
        return yardimRepository.findById(id);
    }

    @Override
    public List<Yardim> getAllYardimlar() {
        return yardimRepository.findAll();
    }

    @Override
    public Yardim updateYardim(Yardim yardim) {
        return yardimRepository.save(yardim);
    }

    @Override
    public void deleteYardim(int id) {
        yardimRepository.deleteById(id);
    }
}
