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
    
    TutanakBorc saveBorc(TutanakBorc tutanakBorc);
    List<TutanakBorc> getAllBorcs();
    Optional<TutanakBorc> getBorcById(Long id);
    TutanakBorc updateBorc(Long id, TutanakBorc tutanakBorc);
    void deleteBorc(Long id);
}
