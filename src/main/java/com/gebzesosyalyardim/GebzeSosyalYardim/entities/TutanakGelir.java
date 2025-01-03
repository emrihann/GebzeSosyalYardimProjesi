package com.gebzesosyalyardim.GebzeSosyalYardim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "TUTANAK_GELIR")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakGelir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GELIR_ID")
    private Long gelirId;

    @Column(name = "YASLILIK", nullable = false)
    private Float yaslilik;

    @Column(name = "ENGELLI", nullable = false)
    private Float engelli;

    @Column(name = "ENGELLI_YAKINI", nullable = false)
    private Float engelliYakini;

    @Column(name = "YETIM_AYLIGI", nullable = false)
    private Float yetimAyligi;

    @Column(name = "EMEKLI_MAASI", nullable = false)
    private Float emekliMaasi;

    @Column(name = "EVDE_BAKIM_PARASI", nullable = false)
    private Float evdeBakimParasi;

    @Column(name = "DUL_MAASI", nullable = false)
    private Float dulMaasi;

    @Column(name = "ISSIZLIK_MAASI", nullable = false)
    private Float issizlikMaasi;

    @Column(name = "ASKER_MAASI", nullable = false)
    private Float askerMaasi;

    @Column(name = "KIRA_MAASI", nullable = false)
    private Float kiraMaasi;

    @Column(name = "KAYMAKAMLIK", nullable = false)
    private Float kaymakamlik;

    @Column(name = "SOSYAL_HIZMETLER", nullable = false)
    private Float sosyalHizmetler;

    @Column(name = "BUYUKSEHIR", nullable = false)
    private Float buyuksehir;

    @Column(name = "OZEL_VAKIF", nullable = false)
    private Float ozelVakif;

    @Column(name = "DIGER", nullable = false)
    private Float diger;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif;

    @Column(name = "KAYIT_TARIHI", nullable = false, updatable = false)
    private LocalDateTime kayitTarihi;

    @Column(name = "GUNCELLEME_TARIHI")
    private LocalDateTime guncellemeTarihi;

    @Column(name = "DIGER_ACIKLAMA", length = 1000)
    private String digerAciklama;
}
