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
@Table(name="YAKINLIK")
@NoArgsConstructor
@AllArgsConstructor
public class Yakinlik {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yakinlik_id")
    private Integer yakinlikId;

    @Column(name = "yakinlik_isim", nullable = false, length = 50)
    private String yakinlikIsim;

    @Column(name = "aktiflik")
    private Integer aktiflik;
}

