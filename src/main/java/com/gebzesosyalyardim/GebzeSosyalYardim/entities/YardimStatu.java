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
@Table(name="YARDIM_STATU")
public class YardimStatu {

    public YardimStatu() {
    }

    public YardimStatu(Integer statu_id, String statu_isim, Date kayit_tarihi, Integer aktif, Date guncelleme_tarihi) {
        this.statu_id = statu_id;
        this.statu_isim = statu_isim;
        this.kayit_tarihi = kayit_tarihi;
        this.aktif = aktif;
        this.guncelleme_tarihi = guncelleme_tarihi;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="statu_id")
    private Integer statu_id;
    
    @Column(name="statu_isim",length=100,nullable=false)
    private String statu_isim;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="kayit_tarihi",nullable=false,updatable=false)
    private Date kayit_tarihi;
    
    @Column(name="aktif",nullable=false)
    private Integer aktif;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="guncelleme_tarihi")
    private Date guncelleme_tarihi;
}
