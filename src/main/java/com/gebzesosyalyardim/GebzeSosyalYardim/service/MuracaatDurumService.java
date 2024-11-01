/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatDurum;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface MuracaatDurumService {
     List<MuracaatDurum> getAllMuracaatDurum();
    Optional<MuracaatDurum> getMuracaatDurumById(Integer id);
    MuracaatDurum createMuracaatDurum(MuracaatDurum muracaatDurum);
    MuracaatDurum updateMuracaatDurum(Integer id, MuracaatDurum muracaatDurum);
    void deleteMuracaatDurum(Integer id);
}
