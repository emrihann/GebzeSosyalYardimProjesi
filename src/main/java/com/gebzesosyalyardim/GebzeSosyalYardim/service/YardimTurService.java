/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimTur;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface YardimTurService {
    YardimTur saveYardimTur(YardimTur yardimTur);
    Optional<YardimTur> getYardimTurById(int id);
    List<YardimTur> getAllYardimTurler();
    YardimTur updateYardimTur(YardimTur yardimTur);
    void deleteYardimTur(int id);
}
