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
@Table(name="KISI_ENGEL")
public class KisiEngel {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KISI_ENGEL_ID")
    private Integer kisi_engel_id;

    @Column(name = "ENGELLI_TIP_ID")
    private Integer engelli_tip_id;

    @Column(name = "ENGELLI_ALT_TIP_ID")
    private Integer engelli_alt_tip_id;

    @Column(name = "KURUM_ID")
    private Integer kurum_id;

    @Column(name = "ALT_KURUM_ID")
    private Integer alt_kurum_id;

    @Column(name = "DERECE", nullable = false)
    private float derece = 0;

    @Column(name = "ENGEL_BASLANGIC", length = 100)
    private String engel_baslangic = "";

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif = 0;

    @Column(name = "HASTALIK", length = 255)
    private String hastalik = "";

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;

}
