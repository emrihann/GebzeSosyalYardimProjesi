/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "TUTANAK_BORC")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakBorc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BORC_ID")
    private Long borcId;

    @Column(name = "ELEKTRIK", nullable = false)
    private BigDecimal elektrik;

    @Column(name = "SU", nullable = false)
    private BigDecimal su;

    @Column(name = "DOGALGAZ", nullable = false)
    private BigDecimal dogalgaz;

    @Column(name = "KIRA", nullable = false)
    private BigDecimal kira;

    @Column(name = "KREDI_KARTI", nullable = false)
    private BigDecimal krediKarti;

    @Column(name = "DIGER", nullable = false)
    private BigDecimal diger;

    @Column(name = "DIGER_ACIKLAMA", length = 255)
    private String digerAciklama;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
}


