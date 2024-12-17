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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name = "KISI_HASTALIK")
@NoArgsConstructor
@AllArgsConstructor
public class KisiHastalik {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_hastalik_seq")
    @SequenceGenerator(name = "kisi_hastalik_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88381", allocationSize = 1)
    @Column(name = "KISI_HASTALIK_ID")
    private Long kisiHastalikId;

    @Column(name = "KISI_ID", nullable = false)
    private Long kisiId;

    @Column(name = "HASTALIK_ID", nullable = false)
    private Long hastalikId;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "KAYIT_TARIHI", updatable = false)
    private ZonedDateTime kayitTarihi;

    @Column(name = "EKLEYEN_KULLANICI_ID", nullable = false)
    private Long ekleyenKullaniciId;
}
