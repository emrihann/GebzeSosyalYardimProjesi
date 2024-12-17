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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="TUTANAK_EV_ESYALARI")
@NoArgsConstructor
@AllArgsConstructor

public class TutanakEvEsyalari {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ESYALAR_ID")
    private Integer esyalarId;

    @Column(name = "KISI_ID")
    private Integer kisiId;

    @Column(name = "KISI_ISIM", length = 100)
    private String kisiIsim;

    @Column(name = "ESYA_ID")
    private Integer esyaId;

    @Column(name = "ESYA_ISIM", length = 100)
    private String esyaIsim;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

    @Column(name = "AKTIFLIK")
    private Integer aktiflik;
}
