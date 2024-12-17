/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiHastalik;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiHastalikService {
    List<KisiHastalik> getAllKisiHastalik();

    Optional<KisiHastalik> getKisiHastalikById(Long id);

    KisiHastalik saveKisiHastalik(KisiHastalik kisiHastalik);

    KisiHastalik updateKisiHastalik(Long id, KisiHastalik kisiHastalik);

    void deleteKisiHastalik(Long id);
}
