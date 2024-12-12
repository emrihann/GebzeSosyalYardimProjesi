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
@Table(name="YARDIM_ALT")
public class YardimAlt {

    public YardimAlt() {
    }

    public YardimAlt(Integer alt_tip_id, Integer tip_id, String alt_tip, String tip_isim, Integer aktif) {
        this.alt_tip_id = alt_tip_id;
        this.tip_id = tip_id;
        this.alt_tip = alt_tip;
        this.tip_isim = tip_isim;
        this.aktif = aktif;
    }
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
