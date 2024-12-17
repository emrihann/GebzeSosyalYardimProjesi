/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiTemel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiTemelService {
    List<KisiTemel> getAllKisiTemel();
    Optional<KisiTemel> getKisiTemelById(Long kisiId);
    KisiTemel saveKisiTemel(KisiTemel kisiTemel);
    KisiTemel updateKisiTemel(Long kisiId, KisiTemel kisiTemel);
    void deleteKisiTemel(Long kisiId);
}
