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
@Table(name = "KISI_EGITIM_DURUM")
@NoArgsConstructor
@AllArgsConstructor
public class KisiEgitimDurum {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_egitim_durum_seq")
    @SequenceGenerator(name = "kisi_egitim_durum_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88377", allocationSize = 1)
    @Column(name = "EGITIM_DURUM_ID")
    private Long egitimDurumId;

    @Column(name = "EGITIM_DURUM", nullable = false, length = 20)
    private String egitimDurum;

    @Column(name = "KAYIT_TARIHI", updatable = false)
    private ZonedDateTime kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
}
