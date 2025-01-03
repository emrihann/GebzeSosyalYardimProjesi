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
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Table(name = "KISI_TEMEL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KisiTemel {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KISI_ID")
    private Long kisiId;

    @Column(name = "KIMLIK_NO", nullable = false, length = 11)
    private Long kimlikNo;

    @Column(name = "ISIM", nullable = false, length = 255)
    private String isim;

    @Column(name = "SOYISIM", nullable = false, length = 255)
    private String soyisim;

    @Column(name = "CINSIYET", nullable = false, length = 1)
    private String cinsiyet;

    @Column(name = "CILT_NO")
    private Integer ciltNo;

    @Column(name = "AILE_SIRA_NO")
    private Integer aileSiraNo;

    @Column(name = "SIRA_NO")
    private Integer siraNo;

    @Column(name = "DOGUM_TARIHI", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dogumTarihi;

    @Column(name = "MEDENI_DURUM_ID")
    private Long medeniDurumId;

    @Column(name = "KAYIT_TARIHI")
    private LocalDateTime kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

    @Column(name = "KISI_DETAY_ID")
    private Long kisiDetayId;
}
