/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yardim;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface YardimService {
      Yardim saveYardim(Yardim yardim);
    Optional<Yardim> getYardimById(int id);
    List<Yardim> getAllYardimlar();
    Yardim updateYardim(Yardim yardim);
    void deleteYardim(int id);
}
