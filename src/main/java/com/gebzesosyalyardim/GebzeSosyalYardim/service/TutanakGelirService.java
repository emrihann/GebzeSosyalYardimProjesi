/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import java.util.List;


/**
 *
 * @author emirh
 */
public interface TutanakGelirService {
    List<TutanakGelir> getAll();
    TutanakGelir getById(Long id);
    TutanakGelir save(TutanakGelir tutanakGelir);
    TutanakGelir update(Long id, TutanakGelir tutanakGelir);
    void delete(Long id);
}
