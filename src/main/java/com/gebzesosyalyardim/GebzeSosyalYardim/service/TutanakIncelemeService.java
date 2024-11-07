/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakInceleme;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakIncelemeService {
    List<TutanakInceleme> findAll();
    Optional<TutanakInceleme> findById(String id);
    TutanakInceleme save(TutanakInceleme tutanakInceleme);
    void deleteById(String id);
}
