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