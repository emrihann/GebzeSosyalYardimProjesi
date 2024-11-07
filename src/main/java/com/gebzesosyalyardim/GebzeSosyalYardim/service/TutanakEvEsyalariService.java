/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvEsyalari;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakEvEsyalariService {
    List<TutanakEvEsyalari> findAll();
    Optional<TutanakEvEsyalari> findById(Integer id);
    TutanakEvEsyalari save(TutanakEvEsyalari tutanakEvEsyalari);
    void deleteById(Integer id);
}
