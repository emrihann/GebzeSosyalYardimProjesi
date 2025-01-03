/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kullanici;
import java.util.List;

/**
 *
 * @author emirh
 */
public interface KullaniciService {
    Kullanici saveKullanici(Kullanici kullanici);
    Kullanici getKullaniciById(Long id);
    List<Kullanici> getAllKullanicilar();
    void deleteKullanici(Long id);
}
