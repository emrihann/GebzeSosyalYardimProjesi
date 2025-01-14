/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiService {
     List<Kisi> getAllKisi();
    Optional<Kisi> getKisiById(Integer id);
    Kisi createKisi(Kisi kisi);
    Kisi updateKisi(Integer id, Kisi kisi);
    void deleteKisi(Integer id);
}