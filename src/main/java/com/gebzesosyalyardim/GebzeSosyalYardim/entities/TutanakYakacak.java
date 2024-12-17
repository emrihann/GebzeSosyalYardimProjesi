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
@Table(name="TUTANAK_YAKACAK")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakYakacak {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TUTANAK_YAKACAK_TIP_ID")
    private Integer tutanakYakacakTipId;

    @Column(name = "YAKACAK_TIP_ISIM", length = 100)
    private String yakacakTipIsim;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;
    
}
