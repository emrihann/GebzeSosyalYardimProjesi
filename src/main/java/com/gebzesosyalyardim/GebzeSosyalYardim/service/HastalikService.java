/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Hastalik;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface HastalikService {
    List<Hastalik> getAllHastalik();

    Optional<Hastalik> getHastalikById(Long id);

    Hastalik saveHastalik(Hastalik hastalik);

    Hastalik updateHastalik(Long id, Hastalik hastalik);

    void deleteHastalik(Long id);
}
