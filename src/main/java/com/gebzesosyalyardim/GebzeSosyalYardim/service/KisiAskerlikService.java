/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author emirh
 */
public interface KisiAskerlikService {
    List<KisiAskerlik> findAll();
    Optional<KisiAskerlik> findById(Long id);
    KisiAskerlik save(KisiAskerlik kisiAskerlik);
    void deleteById(Long id);
}
