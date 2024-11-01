/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakDurum;
import java.util.List;

/**
 *
 * @author emirh
 */
public interface TutanakDurumService {
    List<TutanakDurum> getAllTutanakDurum();
    TutanakDurum getTutanakDurumById(Integer id);
    TutanakDurum createTutanakDurum(TutanakDurum tutanakDurum);
    TutanakDurum updateTutanakDurum(Integer id, TutanakDurum tutanakDurum);
    void deleteTutanakDurum(Integer id);
}
