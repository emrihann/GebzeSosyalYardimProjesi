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
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OKUL")
public class Okul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OKUL_ID")
    private Long okulId;

    @Column(name = "OKUL_ISIM", nullable = false, length = 200)
    private String okulIsim;

    @Column(name = "OKUL_TIP_ID", nullable = false)
    private Long okulTipId;

    @Column(name = "OKUL_TUR_ID", nullable = false)
    private Long okulTurId;

    @Column(name = "OKUL_AKTIF", nullable = false)
    private Integer okulAktif;

    @Column(name = "KAYIT_TARIHI", columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime kayitTarihi;

    @Column(name = "GUNCELLEME_TARIHI")
    private LocalDateTime guncellemeTarihi;
}
