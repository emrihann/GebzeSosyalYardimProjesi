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
@Table(name="YAKINLIK")
public class Yakinlik {

    public Yakinlik() {
    }

    public Yakinlik(Integer yakinlikId, String yakinlikIsim, Integer aktiflik) {
        this.yakinlikId = yakinlikId;
        this.yakinlikIsim = yakinlikIsim;
        this.aktiflik = aktiflik;
    }
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yakinlik_id")
    private Integer yakinlikId;

    @Column(name = "yakinlik_isim", nullable = false, length = 50)
    private String yakinlikIsim;

    @Column(name = "aktiflik")
    private Integer aktiflik;
}

