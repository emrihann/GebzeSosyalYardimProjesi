/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiIletisim;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiIletisimService {
    List<KisiIletisim> getAllKisiIletisim();
    Optional<KisiIletisim> getKisiIletisimById(Integer id);
    KisiIletisim createKisiIletisim(KisiIletisim kisiIletisim);
    KisiIletisim updateKisiIletisim(Integer id, KisiIletisim kisiIletisim);
    void deleteKisiIletisim(Integer id);
}