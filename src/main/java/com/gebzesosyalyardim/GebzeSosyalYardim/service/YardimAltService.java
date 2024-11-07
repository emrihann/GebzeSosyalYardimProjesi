/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimAlt;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface YardimAltService {
     YardimAlt saveYardimAlt(YardimAlt yardimAlt);
    Optional<YardimAlt> getYardimAltById(int id);
    List<YardimAlt> getAllYardimAltlar();
    YardimAlt updateYardimAlt(YardimAlt yardimAlt);
    void deleteYardimAlt(int id);
}
