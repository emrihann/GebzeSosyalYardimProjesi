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
@Table(name="KISI_DETAY")
public class KısıDetay {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETAY_ID")
    private Integer detay_id;

    @Column(name = "KISI_ILETISIM_ID")
    private Integer kisi_iletisim_id;

    @Column(name = "KISI_ADRES_ID")
    private Integer kisi_adres_id;

    @Column(name = "KISI_EGITIM_ID")
    private Integer kisi_egitim_id;

    @Column(name = "KISI_ENGEL_ID")
    private Integer kisi_engel_id;

    @Column(name = "MESLEK_ID")
    private Integer meslek_id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;

    @Column(name = "ASKERLIK_ID")
    private Integer askerlik_id;
}
