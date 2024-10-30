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
@Table(name="TUTANAK_DURUM")
public class TutanakDurum {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TUTANAK_ID")
    private Integer tutanakId;

    @Column(name = "TUTANAK_ISIM", length = 100)
    private String tutanakIsim;

    @Column(name = "AKTIFLIK")
    private Integer aktiflik;
}
