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
import java.math.BigInteger;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kullanici_id")
    private int kullaniciId;

    @Column(name = "kullanici_durum_id")
    private Integer kullaniciDurumId;

    @Column(name = "kullanici_isim", nullable = false, length = 50)
    private String kullaniciIsim;

    @Column(name = "kullanici_adres", length = 255)
    private String kullaniciAdres;

    @Column(name = "kullanici_sicil_no", unique = true)
    private BigInteger kullaniciSicilNo;

    @Column(name = "kullanici_telefon")
    private BigInteger kullaniciTelefon;

    @Column(name = "kullanici_cinsiyet")
    private char kullaniciCinsiyet;

    @Temporal(TemporalType.DATE)
    @Column(name = "kullanici_kayit_tarih")
    private Date kullaniciKayitTarih;

    @Column(name = "kullanici_profil_id")
    private Integer kullaniciProfilId;

    @Column(name = "kullanici_eposta", unique = true)
    private String kullanniciEposta;

    @Column(name = "sifre", nullable = false)
    private String sifre;
    
}
