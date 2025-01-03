/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author emirh
 */
public interface TutanakGelirService {
    List<TutanakGelir> findAll();
    Optional<TutanakGelir> findById(Long id);
    TutanakGelir save(TutanakGelir tutanakGelir);
    void deleteById(Long id);
}
