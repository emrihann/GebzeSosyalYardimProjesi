/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author emirh
 */
public interface KisiAskerlikService {
     List<KisiAskerlik> getAllKisiAskerlik();
    Optional<KisiAskerlik> getKisiAskerlikById(Integer id);
    KisiAskerlik createKisiAskerlik(KisiAskerlik kisiAskerlik);
    KisiAskerlik updateKisiAskerlik(Integer id, KisiAskerlik kisiAskerlik);
    void deleteKisiAskerlik(Integer id);
}