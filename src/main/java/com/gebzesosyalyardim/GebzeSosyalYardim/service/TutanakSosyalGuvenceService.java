/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakSosyalGuvence;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface TutanakSosyalGuvenceService {
     List<TutanakSosyalGuvence> findAll();
    Optional<TutanakSosyalGuvence> findById(Integer id);
    TutanakSosyalGuvence save(TutanakSosyalGuvence tutanakSosyalGuvence);
    void deleteById(Integer id);
}
