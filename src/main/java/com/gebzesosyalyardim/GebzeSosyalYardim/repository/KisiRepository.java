/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.repository;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author emirh
 */
@Repository
public interface KisiRepository extends JpaRepository <Kisi, Integer> {
     Kisi findByKimlikNo(BigDecimal kimlikNo);
    
    // İsim ve soyisim ile sorgulama
    List<Kisi> findByIsimAndSoyisim(String isim, String soyisim);
    
    // Aktif olan kayıtları bulma
    List<Kisi> findByAktif(Integer aktif);
}
