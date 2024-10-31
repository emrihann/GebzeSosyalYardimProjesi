/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlarStatu;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiYakinlarStatuService {
    List<KisiYakinlarStatu> getAllKisiYakinlarStatu();
    Optional<KisiYakinlarStatu> getKisiYakinlarStatuById(Integer id);
    KisiYakinlarStatu createKisiYakinlarStatu(KisiYakinlarStatu kisiYakinlarStatu);
    KisiYakinlarStatu updateKisiYakinlarStatu(Integer id, KisiYakinlarStatu kisiYakinlarStatu);
    void deleteKisiYakinlarStatu(Integer id);
}
