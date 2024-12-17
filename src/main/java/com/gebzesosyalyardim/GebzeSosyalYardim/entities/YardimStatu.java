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
@Table(name="YARDIM_STATU")
@NoArgsConstructor
@AllArgsConstructor
public class YardimStatu {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="STATU_ID")
    private Integer statu_id;
    
    @Column(name="STATU_ISIM",length=100,nullable=false)
    private String statu_isim;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="KAYIT_TARIHI",nullable=false,updatable=false)
    private Date kayit_tarihi;
    
    @Column(name="AKTIF",nullable=false)
    private Integer aktif;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="GUNCELLEME_TARIHI")
    private Date guncelleme_tarihi;
}
