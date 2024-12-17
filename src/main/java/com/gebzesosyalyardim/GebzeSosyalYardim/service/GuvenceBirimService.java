/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.GuvenceBirim;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface GuvenceBirimService {
     List<GuvenceBirim> getAllGuvenceBirim();

    Optional<GuvenceBirim> getGuvenceBirimById(Long id);

    GuvenceBirim saveGuvenceBirim(GuvenceBirim guvenceBirim);

    GuvenceBirim updateGuvenceBirim(Long id, GuvenceBirim guvenceBirim);

    void deleteGuvenceBirim(Long id);
}
