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
@Table(name="KISI_ASKERLIK")
public class KisiAskerlik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASKERLIK_ID")
    private Integer askerlik_id;

    @Column(name = "ASKER_HUKUMLU")
    private Integer asker_hukumlu;

    @Column(name = "SURE")
    private Integer sure;

    @Column(name = "ACIKLAMA", length = 500)
    private String aciklama;

    @Temporal(TemporalType.DATE)
    @Column(name = "BASLANGIC_TARIHI")
    private Date baslangic_tarihi;

    @Temporal(TemporalType.DATE)
    @Column(name = "BITIS_TARIHI")
    private Date bitis_tarihi;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif = 1;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;
}
