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
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name = "KISI_ASKERLIK")
@NoArgsConstructor
@AllArgsConstructor
public class KisiAskerlik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASKERLIK_ID")
    private Long askerlikId;

    @Column(name = "ASKER_HUKUMLU", nullable = false)
    private Integer askerHukumlu;

    @Column(name = "SURE", nullable = false)
    private Integer sure;

    @Column(name = "ACIKLAMA", nullable = false, length = 1000)
    private String aciklama;

    @Column(name = "BASLANGIC_TARIHI", nullable = false)
    private LocalDate baslangicTarihi;

    @Column(name = "BITIS_TARIHI", nullable = false)
    private LocalDate bitisTarihi;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif;

    @Column(name = "KAYIT_TARIHI", nullable = false, updatable = false)
    private LocalDateTime kayitTarihi;

    @Column(name = "GUNCELLEME_TARIHI")
    private LocalDateTime guncellemeTarihi;

    @Column(name = "DIGER")
    private Float diger;

    @Column(name = "DIGER_ACIKLAMA", length = 255)
    private String digerAciklama;

    @Column(name = "DOGALGAZ")
    private Float dogalgaz;

    @Column(name = "ELEKTRIK")
    private Float elektrik;

    @Column(name = "KIRA")
    private Float kira;

    @Column(name = "KREDI_KARTI")
    private Float krediKarti;

    @Column(name = "SU")
    private Float su;
}
