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
@Data
@Entity
@Table(name = "kisi_askerlik")
public class KisiAskerlik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "askerlik_id")
    private Integer askerlik_id;

    @Column(name = "asker_hukumlu")
    private Integer asker_hukumlu;

    @Column(name = "sure")
    private Integer sure;

    @Column(name = "aciklama")
    private String aciklama;

    @Column(name = "baslangic_tarihi")
    @Temporal(TemporalType.DATE)
    private Date baslangic_tarihi;

    @Column(name = "bitis_tarihi")
    @Temporal(TemporalType.DATE)
    private Date bitis_tarihi;

    @Column(name = "aktif")
    private Integer aktif = 1;

    @Column(name = "kayit_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayit_tarihi;

    @Column(name = "guncelleme_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncelleme_tarihi;
}
