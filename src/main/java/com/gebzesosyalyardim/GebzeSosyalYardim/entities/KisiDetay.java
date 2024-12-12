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
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Table(name = "KisiDetay")
@Data  // Lombok @Data anotasyonu ekledik
public class KisiDetay {

    public KisiDetay() {
    }
    

    public KisiDetay(Integer detayId, Integer kisiIletisimId, Integer kisiAdresId, Integer kisiEgitimId, Integer kisiEngelId, Integer meslekId, Date guncellemeTarihi, Integer askerlikId) {
        this.detayId = detayId;
        this.kisiIletisimId = kisiIletisimId;
        this.kisiAdresId = kisiAdresId;
        this.kisiEgitimId = kisiEgitimId;
        this.kisiEngelId = kisiEngelId;
        this.meslekId = meslekId;
        this.guncellemeTarihi = guncellemeTarihi;
        this.askerlikId = askerlikId;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detay_id")
    private Integer detayId;

    @Column(name = "kisi_iletisim_id")
    private Integer kisiIletisimId;

    @Column(name = "kisi_adres_id")
    private Integer kisiAdresId;

    @Column(name = "kisi_egitim_id")
    private Integer kisiEgitimId;

    @Column(name = "kisi_engel_id")
    private Integer kisiEngelId;

    @Column(name = "meslek_id")
    private Integer meslekId;

    @Column(name = "guncelleme_tarihi")
    private Date guncellemeTarihi;

    @Column(name = "askerlik_id")
    private Integer askerlikId;

}
