/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEngel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiEngelService {
     List<KisiEngel> getAllKisiEngel();
    Optional<KisiEngel> getKisiEngelById(Integer id);
    KisiEngel createKisiEngel(KisiEngel kisiEngel);
    KisiEngel updateKisiEngel(Integer id, KisiEngel kisiEngel);
    void deleteKisiEngel(Integer id);
}
