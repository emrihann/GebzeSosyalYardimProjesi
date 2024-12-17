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
@Table(name="TUTANAK_BORC")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakBorc {
   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borc_seq")
    @SequenceGenerator(name = "borc_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88429", allocationSize = 1)
    private Long borcId;

    @Column(name = "ELEKTRIK")
    private Double elektrik = 0.0;

    @Column(name = "SU")
    private Double su = 0.0;

    @Column(name = "DOGALGAZ")
    private Double dogalgaz = 0.0;

    @Column(name = "KIRA")
    private Double kira = 0.0;

    @Column(name = "KREDI_KARTI")
    private Double krediKarti = 0.0;

    @Column(name = "DIGER")
    private Double diger = 0.0;

    @Column(name = "DIGER_ACIKLAMA")
    private String digerAciklama;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
    }

