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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_temel_seq")
    @SequenceGenerator(name = "kisi_temel_seq", sequenceName = "ISEQ$$_87938", allocationSize = 1)
    @Column(name = "KISI_ID")
    private Long kisiId;

    @Column(name = "KIMLIK_NO", nullable = false)
    private Long kimlikNo;

    @Column(name = "ISIM", nullable = false, length = 20)
    private String isim;

    @Column(name = "SOYISIM", nullable = false, length = 20)
    private String soyisim;

    @Column(name = "CINSIYET", nullable = false, length = 1)
    private String cinsiyet;

    @Column(name = "CILT_NO")
    private Long ciltNo;

    @Column(name = "AILE_SIRA_NO")
    private Long aileSiraNo;

    @Column(name = "SIRA_NO")
    private Long siraNo;

    @Column(name = "DOGUM_TARIHI", nullable = false)
    private LocalDateTime dogumTarihi;

    @Column(name = "MEDENI_DURUM_ID")
    private Long medeniDurumId;

    @Column(name = "KAYIT_TARIHI", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime kayitTarihi;

    @Column(name = "AKTIF", nullable = false)
    private Long aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private LocalDateTime guncellemeTarihi;

    @Column(name = "KISI_DETAY_ID")
    private Long kisiDetayId;
}
