/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yakinlik;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface YakinlikService {
     Yakinlik saveYakinlik(Yakinlik yakinlik);
    Optional<Yakinlik> getYakinlikById(int id);
    List<Yakinlik> getAllYakinliklar();
    Yakinlik updateYakinlik(Yakinlik yakinlik);
    void deleteYakinlik(int id);
}
