/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.EngelliTipRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class EngelliTipServiceImpl implements EngelliTipService {
    private final EngelliTipRepository engelliTipRepository;

    @Autowired
    public EngelliTipServiceImpl(EngelliTipRepository engelliTipRepository) {
        this.engelliTipRepository = engelliTipRepository;
    }

    @Override
    public EngelliTip save(EngelliTip engelliTip) {
        return engelliTipRepository.save(engelliTip);
    }

    @Override
    public List<EngelliTip> findAll() {
        return engelliTipRepository.findAll();
    }

    @Override
    public EngelliTip findById(Long id) {
        return engelliTipRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        engelliTipRepository.deleteById(id);
    }
}
