/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimStatu;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimStatuRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class YardimStatuServiceImpl implements YardimStatuService {
     @Autowired
    private YardimStatuRepository yardimStatuRepository;

    @Override
    public YardimStatu saveYardimStatu(YardimStatu yardimStatu) {
        return yardimStatuRepository.save(yardimStatu);
    }

    @Override
    public Optional<YardimStatu> getYardimStatuById(int id) {
        return yardimStatuRepository.findById(id);
    }

    @Override
    public List<YardimStatu> getAllYardimStatuler() {
        return yardimStatuRepository.findAll();
    }

    @Override
    public YardimStatu updateYardimStatu(YardimStatu yardimStatu) {
        return yardimStatuRepository.save(yardimStatu);
    }

    @Override
    public void deleteYardimStatu(int id) {
        yardimStatuRepository.deleteById(id);
    }
}
