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
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="KISI")
public class Kisi {

    public Kisi() {
    }

    public Kisi(Integer kisi_id, BigDecimal kimlik_no, String isim, String soyisim, String cinsiyet, Integer cilt_no, Integer aile_sira_no, Integer sira_no, Date dogum_tarihi, Integer medeni_durum_id, Integer mahalle_id, Integer sokak_id, String site, String adres_tarifi, Integer kapi_no, Integer daire_no, String ev_telefon, String cep_telefon, String eposta, Date kayit_tarihi, Integer aktif) {
        this.kisi_id = kisi_id;
        this.kimlik_no = kimlik_no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.cinsiyet = cinsiyet;
        this.cilt_no = cilt_no;
        this.aile_sira_no = aile_sira_no;
        this.sira_no = sira_no;
        this.dogum_tarihi = dogum_tarihi;
        this.medeni_durum_id = medeni_durum_id;
        this.mahalle_id = mahalle_id;
        this.sokak_id = sokak_id;
        this.site = site;
        this.adres_tarifi = adres_tarifi;
        this.kapi_no = kapi_no;
        this.daire_no = daire_no;
        this.ev_telefon = ev_telefon;
        this.cep_telefon = cep_telefon;
        this.eposta = eposta;
        this.kayit_tarihi = kayit_tarihi;
        this.aktif = aktif;
    }
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KISI_ID")
    private Integer kisi_id;

    @Column(name = "KIMLIK_NO", precision = 11, scale = 0, unique = true, nullable = false)
    private BigDecimal kimlik_no;

    @Column(name = "ISIM", length = 100, nullable = false)
    private String isim;

    @Column(name = "SOYISIM", length = 100, nullable = false)
    private String soyisim;

    @Column(name = "CINSIYET", length = 1)
    private String cinsiyet;

    @Column(name = "CILT_NO")
    private Integer cilt_no;

    @Column(name = "AILE_SIRA_NO")
    private Integer aile_sira_no;

    @Column(name = "SIRA_NO")
    private Integer sira_no;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOGUM_TARIHI")
    private Date dogum_tarihi;

    @Column(name = "MEDENI_DURUM_ID")
    private Integer medeni_durum_id;

    @Column(name = "MAHALLE_ID")
    private Integer mahalle_id;

    @Column(name = "SOKAK_ID")
    private Integer sokak_id;

    @Column(name = "SITE", length = 255)
    private String site;

    @Column(name = "ADRES_TARIFI", length = 500)
    private String adres_tarifi;

    @Column(name = "KAPI_NO")
    private Integer kapi_no;

    @Column(name = "DAIRE_NO")
    private Integer daire_no;

    @Column(name = "EV_TELEFON", length = 20)
    private String ev_telefon;

    @Column(name = "CEP_TELEFON", length = 20)
    private String cep_telefon;

    @Column(name = "EPOSTA", length = 100, unique = true)
    private String eposta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Column(name = "AKTIF")
    private Integer aktif;
}