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
    List<TutanakBorc> findAll();
    Optional<TutanakBorc> findById(Long id);
    TutanakBorc save(TutanakBorc tutanakBorc);
    void deleteById(Long id);
   
}
