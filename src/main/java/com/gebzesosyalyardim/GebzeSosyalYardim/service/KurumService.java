/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kurum;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KurumService {
     List<Kurum> getAllKurum();
    Optional<Kurum> getKurumById(Integer id);
    Kurum createKurum(Kurum kurum);
    Kurum updateKurum(Integer id, Kurum kurum);
    void deleteKurum(Integer id);
}
