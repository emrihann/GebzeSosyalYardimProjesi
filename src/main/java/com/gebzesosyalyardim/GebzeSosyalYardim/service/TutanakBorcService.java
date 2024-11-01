/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;


import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakBorcService {
      List<TutanakBorc> getAllTutanakBorc();
    Optional<TutanakBorc> getTutanakBorcById(Integer id);
    TutanakBorc createTutanakBorc(TutanakBorc tutanakBorc);
    TutanakBorc updateTutanakBorc(Integer id, TutanakBorc tutanakBorc);
    void deleteTutanakBorc(Integer id);;
}
