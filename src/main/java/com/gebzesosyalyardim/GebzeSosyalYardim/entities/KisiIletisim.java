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
