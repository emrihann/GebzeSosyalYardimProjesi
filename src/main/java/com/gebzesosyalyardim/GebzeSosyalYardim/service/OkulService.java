/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Okul;
import java.util.List;

/**
 *
 * @author emirh
 */
public interface OkulService {
     Okul saveOkul(Okul okul);
    Okul getOkulById(Long id);
    List<Okul> getAllOkullar();
    void deleteOkul(Long id);
}
