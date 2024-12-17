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
@Table(name="TUTANAK_DURUM")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakDurum {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutanak_durum_seq")
    @SequenceGenerator(name = "tutanak_durum_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88433", allocationSize = 1)
    @Column(name = "DURUM_ID")
    private Long durumId;

    @Column(name = "DURUM_ISIM")
    private String durumIsim;

    @Column(name = "AKTIFLIK")
    private Integer aktiflik;

    @Column(name = "KAYIT_TARIHI")
    private ZonedDateTime kayitTarihi;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

    @Column(name = "TUTANAK_ISIM")
    private String tutanakIsim;
}
