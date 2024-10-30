/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="KURUM")
public class Kurum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kurum_id")
    private Integer kurumId;

    @Column(name = "kurum_isim", nullable = false, length = 100)
    private String kurumIsim;

    @Column(name = "aktif", nullable = false)
    private Integer aktif;
    
}
