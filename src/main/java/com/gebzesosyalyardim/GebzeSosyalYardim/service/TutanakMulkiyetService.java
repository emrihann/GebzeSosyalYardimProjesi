/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import java.util.List;
import java.util.Optional;



/**
 *
 * @author emirh
 */
public interface TutanakMulkiyetService {
    List<TutanakMulkiyet> findAll();
    Optional<TutanakMulkiyet> findById(Integer id);
    TutanakMulkiyet save(TutanakMulkiyet tutanakMulkiyet);
    void deleteById(Integer id);
}
