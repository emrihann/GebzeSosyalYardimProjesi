/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvTip;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakEvTipService {
       List<TutanakEvTip> findAll();
    Optional<TutanakEvTip> findById(Integer id);
    TutanakEvTip save(TutanakEvTip tutanakEvTip);
    void deleteById(Integer id);
}
