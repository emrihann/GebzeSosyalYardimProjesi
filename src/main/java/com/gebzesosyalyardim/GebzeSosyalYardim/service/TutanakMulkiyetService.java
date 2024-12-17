/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import java.util.List;




/**
 *
 * @author emirh
 */
public interface TutanakMulkiyetService {
    List<TutanakMulkiyet> getAll();
    TutanakMulkiyet getById(Long id);
    TutanakMulkiyet save(TutanakMulkiyet tutanakMulkiyet);
    TutanakMulkiyet update(Long id, TutanakMulkiyet tutanakMulkiyet);
    void delete(Long id);
}
