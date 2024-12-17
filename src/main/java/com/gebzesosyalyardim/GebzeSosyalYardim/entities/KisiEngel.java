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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.ZonedDateTime;
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
@Table(name="KISI_ENGEL")
@NoArgsConstructor
@AllArgsConstructor
public class KisiEngel {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_engel_seq")
    @SequenceGenerator(name = "kisi_engel_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88379", allocationSize = 1)
    @Column(name = "KISI_ENGEL_ID")
    private Long kisiEngelId;

    @Column(name = "ENGELLI_TIP_ID", nullable = false)
    private Long engelliTipId;

    @Column(name = "ENGELLI_ALT_TIP_ID", nullable = false)
    private Long engelliAltTipId;

    @Column(name = "KURUM_ID", nullable = false)
    private Long kurumId;

    @Column(name = "ALT_KURUM_ID", nullable = false)
    private Long altKurumId;

    @Column(name = "DERECE", nullable = false)
    private Float derece;

    @Column(name = "ENGEL_BASLANGIC", nullable = false, length = 100)
    private String engelBaslangic;

    @Column(name = "KAYIT_TARIHI", updatable = false)
    private ZonedDateTime kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "HASTALIK", length = 255)
    private String hastalik;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

}
