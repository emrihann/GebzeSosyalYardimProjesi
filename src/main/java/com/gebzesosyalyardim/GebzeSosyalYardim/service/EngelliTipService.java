/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import java.util.List;

/**
 *
 * @author emirh
 */
public interface EngelliTipService {
      EngelliTip save(EngelliTip engelliTip);
    List<EngelliTip> findAll();
    EngelliTip findById(Long id);
    void deleteById(Long id);
}
