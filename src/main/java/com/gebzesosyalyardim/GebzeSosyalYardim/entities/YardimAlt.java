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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="YARDIM_ALT")
@NoArgsConstructor
@AllArgsConstructor
public class YardimAlt {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_tip_id")
    private Integer alt_tip_id;

    @Column(name = "tip_id", nullable = false)
    private Integer tip_id;

    @Column(name = "alt_tip", length = 100)
    private String alt_tip;

    @Column(name = "tip_isim", length = 100)
    private String tip_isim;

    @Column(name = "aktif")
    private Integer aktif;
}
