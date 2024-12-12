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
@Table(name="YARDIM")
public class Yardim {

    public Yardim() {
    }

    public Yardim(Integer yardim_tip_id, String yardim_tip, Integer yardim_tur_id, Integer aktif) {
        this.yardim_tip_id = yardim_tip_id;
        this.yardim_tip = yardim_tip;
        this.yardim_tur_id = yardim_tur_id;
        this.aktif = aktif;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yardim_tip_id")
    private Integer yardim_tip_id;

    @Column(name = "yardim_tip", nullable = false, length = 100)
    private String yardim_tip;

    @Column(name = "yardim_tur_id")
    private Integer yardim_tur_id;

    @Column(name = "aktif")
    private Integer aktif;
}
