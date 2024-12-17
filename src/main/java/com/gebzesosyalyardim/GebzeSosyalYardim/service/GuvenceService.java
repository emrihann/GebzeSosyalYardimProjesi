/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Guvence;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface GuvenceService {
    List<Guvence> getAllGuvence();

    Optional<Guvence> getGuvenceById(Long id);

    Guvence saveGuvence(Guvence guvence);

    Guvence updateGuvence(Long id, Guvence guvence);

    void deleteGuvence(Long id);
}
