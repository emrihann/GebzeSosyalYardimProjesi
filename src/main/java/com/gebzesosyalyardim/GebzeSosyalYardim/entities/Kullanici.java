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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "KULLANICI")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KULLANICI_ID")
    private Long kullaniciId;

    @Column(name = "KULLANICI_KULLANICI_ADI", nullable = false, length = 20)
    private String kullaniciKullaniciAdi;

    @Column(name = "KULLANICI_ISIM", nullable = false, length = 20)
    private String kullaniciIsim;

    @Column(name = "KULLANICI_CINSIYET", nullable = false, length = 1)
    private char kullaniciCinsiyet;

    @Column(name = "KULLANICI_TELEFON", nullable = false, precision = 11)
    private Long kullaniciTelefon;

    @Column(name = "KULLANICI_KAYIT_TARIH", nullable = false)
    private LocalDateTime kullaniciKayitTarih;

    @Column(name = "KULLANICI_DURUM_ID", nullable = false)
    private Long kullaniciDurumId;

    @Column(name = "KULLANICI_SICIL_NO", nullable = false, precision = 16)
    private Long kullaniciSicilNo;

    @Column(name = "KULLANICI_ADRES", nullable = false, length = 300)
    private String kullaniciAdres;

    @Column(name = "KULLANICI_PROFIL_ID")
    private Long kullaniciProfilId;

    @Column(name = "SIFRE", nullable = false, length = 100)
    private String sifre;

    @Column(name = "KULLANICI_EPOSTA", length = 100)
    private String kullaniciEposta;

    @Column(name = "KULLANICI_UNVAN", length = 60)
    private String kullaniciUnvan;

    @Column(name = "AKTIF", columnDefinition = "NUMBER(1)")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private LocalDateTime guncellemeTarihi;
}
