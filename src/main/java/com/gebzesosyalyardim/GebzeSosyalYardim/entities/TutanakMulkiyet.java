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
@Table(name="TUTANAK_MULKIYET")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakMulkiyet {
      @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mulkiyet_seq")
    @SequenceGenerator(name = "mulkiyet_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88451", allocationSize = 1)
    private Long mulkiyetId;

    @Column(name = "MULKIYET_SIRA_NO")
    private Long mulkiyetSiraNo;

    @Column(name = "EV_DURUM_ID", nullable = false)
    private Long evDurumId;

    @Column(name = "KIRA_MIKTAR")
    private Double kiraMiktar = 0.0;

    @Column(name = "YAKACAK_TIP_ID")
    private Long yakacakTipId;

    @Column(name = "KIRADA_EV_SAYISI")
    private Long kiradaEvSayisi = 0L;

    @Column(name = "ARABA_VAR_MI", nullable = false)
    private Integer arabaVarMi;

    @Column(name = "ARABA_MODEL", length = 100)
    private String arabaModel;

    @Column(name = "GAYRIMENKUL_VAR_MI", nullable = false)
    private Integer gayrimenkulVarMi;

    @Column(name = "GAYRIMENKUL_TUR", length = 100)
    private String gayrimenkulTur;

    @Column(name = "EV_TIP_ID", nullable = false)
    private Long evTipId;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

    @Column(name = "KIRADA_EV_VAR_MI", nullable = false)
    private Long kiradaEvVarMi = 0L;

    @Column(name = "EV_DURUM_ISIM", length = 100)
    private String evDurumIsim;

    @Column(name = "EV_TIP_ISIM", length = 100)
    private String evTipIsim;

    @Column(name = "YAKACAK_TIP_ISIM", length = 100)
    private String yakacakTipIsim;
}
