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
@Table(name = "KISI_DETAY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KisiDetay {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_detay_seq")
    @SequenceGenerator(name = "kisi_detay_seq", sequenceName = "GEBZEADMIN.ISEQ$$_87924", allocationSize = 1)
    @Column(name = "DETAY_ID")
    private Long detayId;

    @Column(name = "KISI_ILETISIM_ID", nullable = false)
    private Long kisiIletisimId;

    @Column(name = "KISI_ADRES_ID", nullable = false)
    private Long kisiAdresId;

    @Column(name = "KISI_EGITIM_ID", nullable = false)
    private Long kisiEgitimId;

    @Column(name = "KISI_ENGEL_ID")
    private Long kisiEngelId;

    @Column(name = "MESLEK_ID")
    private Long meslekId;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

    @Column(name = "ASKERLIK_ID")
    private Long askerlikId;

    @Column(name = "KISI_ID")
    private Long kisiId;
}
