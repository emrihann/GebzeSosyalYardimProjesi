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
@Table(name="KISI_YAKINLAR_STATU")
public class KisiYakinlarStatu {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ozel_statu_id")
    private Integer ozelStatuId;

    @Column(name = "ozel_statu", nullable = false, length = 100)
    private String ozelStatu;

    @Column(name = "aktif", nullable = false)
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "kayit_tarihi")
    private Date kayitTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "guncelleme_tarihi")
    private Date guncellemeTarihi;
}
