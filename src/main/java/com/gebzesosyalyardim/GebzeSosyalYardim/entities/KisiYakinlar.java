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
@Table(name="KISI_YAKINLAR")
public class KisiYakinlar {

    public KisiYakinlar() {
    }
    

    public KisiYakinlar(Integer yakinlar_id, Integer kisi_id, Integer ozel_statu_id, Date olum_tarihi, Date kayit_tarihi, Date guncelleme_tarihi, Integer yakin_id, Integer yakinlik_id) {
        this.yakinlar_id = yakinlar_id;
        this.kisi_id = kisi_id;
        this.ozel_statu_id = ozel_statu_id;
        this.olum_tarihi = olum_tarihi;
        this.kayit_tarihi = kayit_tarihi;
        this.guncelleme_tarihi = guncelleme_tarihi;
        this.yakin_id = yakin_id;
        this.yakinlik_id = yakinlik_id;
    }
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "YAKINLAR_ID")
    private Integer yakinlar_id;

    @Column(name = "KISI_ID")
    private Integer kisi_id;

    @Column(name = "OZEL_STATU_ID")
    private Integer ozel_statu_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "OLUM_TARIHI")
    private Date olum_tarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayit_tarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;

    @Column(name = "YAKIN_ID")
    private Integer yakin_id;

    @Column(name = "YAKINLIK_ID")
    private Integer yakinlik_id;

}
