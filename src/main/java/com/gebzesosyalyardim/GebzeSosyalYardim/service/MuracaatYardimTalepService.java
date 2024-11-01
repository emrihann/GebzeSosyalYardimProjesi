/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatYardimTalep;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface MuracaatYardimTalepService {
     List<MuracaatYardimTalep> getAllMuracaatYardimTalep();
    Optional<MuracaatYardimTalep> getMuracaatYardimTalepById(Integer id);
    MuracaatYardimTalep createMuracaatYardimTalep(MuracaatYardimTalep muracaatYardimTalep);
    MuracaatYardimTalep updateMuracaatYardimTalep(Integer id, MuracaatYardimTalep muracaatYardimTalep);
    void deleteMuracaatYardimTalep(Integer id);
    
}
