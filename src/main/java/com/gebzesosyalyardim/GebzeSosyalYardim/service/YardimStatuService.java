/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimStatu;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface YardimStatuService {
    YardimStatu saveYardimStatu(YardimStatu yardimStatu);
    Optional<YardimStatu> getYardimStatuById(int id);
    List<YardimStatu> getAllYardimStatuler();
    YardimStatu updateYardimStatu(YardimStatu yardimStatu);
    void deleteYardimStatu(int id);
}
