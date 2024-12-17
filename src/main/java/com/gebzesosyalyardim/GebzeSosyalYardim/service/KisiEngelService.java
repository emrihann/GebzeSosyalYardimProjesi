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

    Optional<KisiEngel> getKisiEngelById(Long id);

    KisiEngel saveKisiEngel(KisiEngel kisiEngel);

    KisiEngel updateKisiEngel(Long id, KisiEngel kisiEngel);

    void deleteKisiEngel(Long id);
}
