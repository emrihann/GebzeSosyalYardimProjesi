/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;


import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAdres;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */

public interface KisiAdresService {
    List<KisiAdres> getAllKisiAdres();
    Optional<KisiAdres> getKisiAdresById(Integer id);
    KisiAdres createKisiAdres(KisiAdres kisiAdres);
    KisiAdres updateKisiAdres(Integer id, KisiAdres kisiAdres);
    void deleteKisiAdres(Integer id);
}
