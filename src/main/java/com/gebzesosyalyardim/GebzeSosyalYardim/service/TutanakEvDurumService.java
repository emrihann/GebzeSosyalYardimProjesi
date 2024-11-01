/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvDurum;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakEvDurumService {
    List<TutanakEvDurum> findAll();

    Optional<TutanakEvDurum> findById(Integer id);

    TutanakEvDurum save(TutanakEvDurum tutanakEvDurum);

    void deleteById(Integer id);
}
