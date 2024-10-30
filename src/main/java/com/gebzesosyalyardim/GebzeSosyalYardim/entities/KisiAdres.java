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
@Table(name="KISI_ADRES")
public class KisiAdres {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KISI_ADRES_ID")
    private Integer kisi_adres_id;

    @Column(name = "TARIF", length = 500)
    private String tarif;

    @Column(name = "SITE", length = 255)
    private String site;

    @Column(name = "KAPI_NO")
    private Integer kapi_no;

    @Column(name = "DAIRE_NO")
    private Integer daire_no;

    @Column(name = "KISI_ADRES_MAHALLE_ID")
    private Integer kisi_adres_mahalle_id;

    @Column(name = "KISI_ADRES_MAHALLE_ISIM", length = 100)
    private String kisi_adres_mahalle_isim;

    @Column(name = "KISI_MAHALLE_SOKAK_ID")
    private Integer kisi_mahalle_sokak_id;

    @Column(name = "KISI_MAHALLE_SOKAK_ISIM", length = 100)
    private String kisi_mahalle_sokak_isim;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif = 1;
}
