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
@Table(name="MURACAAT_BILGI")
public class MuracaatBilgi {

    public MuracaatBilgi() {
    }

    public MuracaatBilgi(Integer muracaatBilgiId, Integer arsivDosyaNo, String aciklama, Integer aktif, Date kayitTarih, Date guncellemeTarih) {
        this.muracaatBilgiId = muracaatBilgiId;
        this.arsivDosyaNo = arsivDosyaNo;
        this.aciklama = aciklama;
        this.aktif = aktif;
        this.kayitTarih = kayitTarih;
        this.guncellemeTarih = guncellemeTarih;
    }
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MURACAAT_BILGI_ID")
    private Integer muracaatBilgiId;

    @Column(name = "ARSIV_DOSYA_NO")
    private Integer arsivDosyaNo;

    @Column(name = "ACIKLAMA", length = 255)
    private String aciklama;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MURACAAT_TARIHI")
    private Date muracaatTarihi = new Date();

    @Column(name = "AKTIF")
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayitTarih;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarih;
}
