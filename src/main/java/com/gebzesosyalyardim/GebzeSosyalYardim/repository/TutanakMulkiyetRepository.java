/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.repository;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakMulkiyet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author emirh
 */
@Repository
public interface TutanakMulkiyetRepository extends JpaRepository<TutanakMulkiyet, Integer> {
    
}