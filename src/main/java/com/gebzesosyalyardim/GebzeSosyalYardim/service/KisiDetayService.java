/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiDetayService {
    List<KisiDetay> findAll();

    Optional<KisiDetay> findById(Long id);

    KisiDetay save(KisiDetay kisiDetay);

    void deleteById(Long id);
}
