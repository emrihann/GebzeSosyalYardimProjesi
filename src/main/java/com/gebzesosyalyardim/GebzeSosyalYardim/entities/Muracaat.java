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
@Table(name="MURACAAT")
public class Muracaat {

    public Muracaat() {
    }
    

    public Muracaat(Integer muracaatId, Integer kisiTemelId, Integer muracaatBilgiId, Date kayitTarihi, Integer aktif, Date guncellemeTarihi, BigInteger kimlikNo, String kisiIsim, String kisiSoyisim, Integer arsivDosyaNo, Date muracaatTarihi, String mahalle, String sokak, Integer muracaatDurumId) {
        this.muracaatId = muracaatId;
        this.kisiTemelId = kisiTemelId;
        this.muracaatBilgiId = muracaatBilgiId;
        this.kayitTarihi = kayitTarihi;
        this.aktif = aktif;
        this.guncellemeTarihi = guncellemeTarihi;
        this.kimlikNo = kimlikNo;
        this.kisiIsim = kisiIsim;
        this.kisiSoyisim = kisiSoyisim;
        this.arsivDosyaNo = arsivDosyaNo;
        this.muracaatTarihi = muracaatTarihi;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.muracaatDurumId = muracaatDurumId;
    }
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MURACAAT_ID")
    private Integer muracaatId;

    @Column(name = "KISI_TEMEL_ID")
    private Integer kisiTemelId;

    @Column(name = "MURACAAT_BILGI_ID")
    private Integer muracaatBilgiId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

    @Column(name = "KIMLIK_NO", unique = true, nullable = false)
    private BigInteger kimlikNo;

    @Column(name = "KISI_ISIM", length = 50)
    private String kisiIsim;

    @Column(name = "KISI_SOYISIM", length = 50)
    private String kisiSoyisim;

    @Column(name = "ARSIV_DOSYA_NO")
    private Integer arsivDosyaNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "MURACAAT_TARIHI")
    private Date muracaatTarihi;

    @Column(name = "MAHALLE", length = 100)
    private String mahalle;

    @Column(name = "SOKAK", length = 100)
    private String sokak;

    @Column(name = "MURACAAT_DURUM_ID")
    private Integer muracaatDurumId;
}
