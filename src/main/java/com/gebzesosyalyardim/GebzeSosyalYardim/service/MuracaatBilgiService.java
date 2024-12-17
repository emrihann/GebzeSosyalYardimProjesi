/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatBilgi;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author emirh
 */
public interface MuracaatBilgiService  {
    MuracaatBilgi saveMuracaatBilgi(MuracaatBilgi muracaatBilgi);
    Optional<MuracaatBilgi> getMuracaatBilgiById(Long id);
    List<MuracaatBilgi> getAllMuracaatBilgi();
    void deleteMuracaatBilgi(Long id);
}
