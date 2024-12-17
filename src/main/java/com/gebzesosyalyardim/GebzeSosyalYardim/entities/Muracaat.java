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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="MURACAAT")
@NoArgsConstructor
@AllArgsConstructor
public class Muracaat {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MURACAAT_ID")
    private Integer muracaatId;

    @Column(name = "KISI_TEMEL_ID")
    private Integer kisiTemelId;

    @Column(name = "MURACAAT_BILGI_ID")
    private Integer muracaatBilgiId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "KAYIT_TARIHI")
    private Date kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

   
}
