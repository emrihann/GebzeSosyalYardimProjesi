/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import java.util.List;


/**
 *
 * @author emirh
 */
public interface KisiAskerlikService {
    List<KisiAskerlik> getAll();
    KisiAskerlik getById(Long id);
    KisiAskerlik save(KisiAskerlik kisiAskerlik);
    KisiAskerlik update(Long id, KisiAskerlik kisiAskerlik);
    void delete(Long id);
}
