/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEgitimDurum;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface KisiEgitimDurumService {
    List<KisiEgitimDurum> getAllKisiEgitimDurum();

    Optional<KisiEgitimDurum> getKisiEgitimDurumById(Long id);

    KisiEgitimDurum saveKisiEgitimDurum(KisiEgitimDurum kisiEgitimDurum);

    KisiEgitimDurum updateKisiEgitimDurum(Long id, KisiEgitimDurum kisiEgitimDurum);

    void deleteKisiEgitimDurum(Long id);
}
