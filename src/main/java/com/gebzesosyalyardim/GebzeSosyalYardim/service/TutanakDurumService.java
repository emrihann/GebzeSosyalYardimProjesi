/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakDurum;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakDurumService {
    List<TutanakDurum> getAllTutanakDurum();

    Optional<TutanakDurum> getTutanakDurumById(Long id);

    TutanakDurum saveTutanakDurum(TutanakDurum tutanakDurum);

    TutanakDurum updateTutanakDurum(Long id, TutanakDurum tutanakDurum);

    void deleteTutanakDurum(Long id);
}
