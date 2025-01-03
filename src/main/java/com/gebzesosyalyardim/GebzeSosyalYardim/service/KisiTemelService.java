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
    KisiTemel saveKisiTemel(KisiTemel kisiTemel);
    List<KisiTemel> getAllKisiler();
    Optional<KisiTemel> getKisiById(Long id);
    KisiTemel updateKisiTemel(Long id, KisiTemel kisiTemel);
    void deleteKisiById(Long id);
}
