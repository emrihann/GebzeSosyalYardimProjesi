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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="KISI_YAKINLAR")
@NoArgsConstructor
@AllArgsConstructor
public class KisiYakinlar {
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
