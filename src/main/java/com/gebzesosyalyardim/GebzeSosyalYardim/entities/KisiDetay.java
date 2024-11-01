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
@Table(name = "KISI_DETAY") 
public class KisiDetay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETAY_ID")
    private Integer detayId;

    @Column(name = "KISI_ILETISIM_ID")
    private Integer kisiIletisimId;

    @Column(name = "KISI_ADRES_ID")
    private Integer kisiAdresId;

    @Column(name = "KISI_EGITIM_ID")
    private Integer kisiEgitimId;

    @Column(name = "KISI_ENGEL_ID")
    private Integer kisiEngelId;

    @Column(name = "MESLEK_ID")
    private Integer meslekId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

    @Column(name = "ASKERLIK_ID")
    private Integer askerlikId;
}
