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
@Table(name="YARDIM_TUR")
public class YardimTur {

    public YardimTur() {
    }

    public YardimTur(Integer tur_id, String tur, Date kayit_tarihi, Integer aktif) {
        this.tur_id = tur_id;
        this.tur = tur;
        this.kayit_tarihi = kayit_tarihi;
        this.aktif = aktif;
    }
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tur_id")
    private Integer tur_id;

    @Column(name = "tur", length = 100, nullable = false)
    private String tur;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "kayit_tarihi", nullable = false, updatable = false)
    private Date kayit_tarihi;

    @Column(name = "aktif", nullable = false)
    private Integer aktif;
}
