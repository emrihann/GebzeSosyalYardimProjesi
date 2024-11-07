/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakYakacak;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakYakacakService {
     List<TutanakYakacak> findAll();
    Optional<TutanakYakacak> findById(Integer id);
    TutanakYakacak save(TutanakYakacak tutanakYakacak);
    void deleteById(Integer id); 
}
