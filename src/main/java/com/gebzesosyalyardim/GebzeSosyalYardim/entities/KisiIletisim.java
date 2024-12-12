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
@Table(name="KISI_ILETISIM")
public class KisiIletisim {

    public KisiIletisim() {
    }
    

    public KisiIletisim(Integer kisi_iletisim_id, BigInteger ev_telefon, BigInteger cep_telefon, String eposta, Date kayit_tarihi, Integer aktif, Date guncelleme_tarihi) {
        this.kisi_iletisim_id = kisi_iletisim_id;
        this.ev_telefon = ev_telefon;
        this.cep_telefon = cep_telefon;
        this.eposta = eposta;
        this.kayit_tarihi = kayit_tarihi;
        this.aktif = aktif;
        this.guncelleme_tarihi = guncelleme_tarihi;
    }
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KISI_ILETISIM_ID")
    private Integer kisi_iletisim_id;

    @Column(name = "EV_TELEFON")
    private BigInteger ev_telefon;

    @Column(name = "CEP_TELEFON")
    private BigInteger cep_telefon;

    @Column(name = "EPOSTA", length = 255)
    private String eposta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;
}
