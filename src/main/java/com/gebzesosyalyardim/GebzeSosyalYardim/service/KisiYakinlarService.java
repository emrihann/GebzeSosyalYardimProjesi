/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlar;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiYakinlarService {
      List<KisiYakinlar> getAllKisiYakinlar();
    Optional<KisiYakinlar> getKisiYakinlarById(Integer id);
    KisiYakinlar createKisiYakinlar(KisiYakinlar kisiYakinlar);
    KisiYakinlar updateKisiYakinlar(Integer id, KisiYakinlar kisiYakinlar);
    void deleteKisiYakinlar(Integer id);
}
