/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Muracaat;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface MuracaatService {
      List<Muracaat> getAllMuracaat();
    Optional<Muracaat> getMuracaatById(Integer id);
    Muracaat createMuracaat(Muracaat muracaat);
    Muracaat updateMuracaat(Integer id, Muracaat muracaat);
    void deleteMuracaat(Integer id);
}
