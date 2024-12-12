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
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="TUTANAK_GELIR")
public class TutanakGelir {

    public TutanakGelir() {
    }

    public TutanakGelir(Integer gelirId, Date kayitTarihi, Date guncellemeTarihi) {
        this.gelirId = gelirId;
        this.kayitTarihi = kayitTarihi;
        this.guncellemeTarihi = guncellemeTarihi;
    }
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GELIR_ID")
    private Integer gelirId;

    @Column(name = "YASLILIK", columnDefinition = "float default 0")
    private float yaslilik = 0;

    @Column(name = "ENGELLI", columnDefinition = "float default 0")
    private float engelli = 0;

    @Column(name = "ENGELLI_YAKINI", columnDefinition = "float default 0")
    private float engelliYakini = 0;

    @Column(name = "YETIM_AYLIGI", columnDefinition = "float default 0")
    private float yetimAyligi = 0;

    @Column(name = "EMEKLI_MAASI", columnDefinition = "float default 0")
    private float emekliMaasi = 0;

    @Column(name = "EVDE_BAKIM_PARASI", columnDefinition = "float default 0")
    private float evdeBakimParasi = 0;

    @Column(name = "DUL_MAASI", columnDefinition = "float default 0")
    private float dulMaasi = 0;

    @Column(name = "ISSIZLIK_MAASI", columnDefinition = "float default 0")
    private float issizlikMaasi = 0;

    @Column(name = "ASKER_MAASI", columnDefinition = "float default 0")
    private float askerMaasi = 0;

    @Column(name = "KIRA_MAASI", columnDefinition = "float default 0")
    private float kiraMaasi = 0;

    @Column(name = "KAYMAKAMLIK", columnDefinition = "float default 0")
    private float kaymakamlik = 0;

    @Column(name = "SOSYAL_HIZMETLER", columnDefinition = "float default 0")
    private float sosyalHizmetler = 0;

    @Column(name = "BUYUKSEHIR", columnDefinition = "float default 0")
    private float buyuksehir = 0;

    @Column(name = "OZEL_VAKIF", columnDefinition = "float default 0")
    private float ozelVakif = 0;

    @Column(name = "DIGER", columnDefinition = "float default 0")
    private float diger = 0;

    @Column(name = "DIGER_ACIKLAMA", length = 255)
    private String digerAciklama = "";

    @Column(name = "AKTIF", columnDefinition = "int default 0")
    private Integer aktif = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayitTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;
}
