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
import java.math.BigInteger;
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
@Table(name="KISI_ILETISIM")
@NoArgsConstructor
@AllArgsConstructor
public class KisiIletisim {
      @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kisi_iletisim_seq")
    @SequenceGenerator(name = "kisi_iletisim_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88383", allocationSize = 1)
    @Column(name = "KISI_ILETISIM_ID")
    private Long kisiIletisimId;

    @Column(name = "EV_TELEFON")
    private Long evTelefon;

    @Column(name = "CEP_TELEFON", nullable = false)
    private Long cepTelefon;

    @Column(name = "EPOSTA")
    private String eposta;

    @Column(name = "KAYIT_TARIHI", updatable = false)
    private ZonedDateTime kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
}
