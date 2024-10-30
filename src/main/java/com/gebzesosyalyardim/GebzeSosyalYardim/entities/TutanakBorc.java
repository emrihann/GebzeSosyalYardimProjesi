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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="TUTANAK_BORC")
public class TutanakBorc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BORC_ID")
    private Integer borcId;

    @Column(name = "ELEKTRIK", columnDefinition = "float default 0")
    private float elektrik = 0;

    @Column(name = "SU", columnDefinition = "float default 0")
    private float su = 0;

    @Column(name = "DOGALGAZ", columnDefinition = "float default 0")
    private float dogalgaz = 0;

    @Column(name = "KIRA", columnDefinition = "float default 0")
    private float kira = 0;

    @Column(name = "KREDI_KARTI", columnDefinition = "float default 0")
    private float krediKarti = 0;

    @Column(name = "DIGER", columnDefinition = "float default 0")
    private float diger = 0;

    @Column(name = "DIGER_ACIKLAMA", length = 255)
    private String digerAciklama = "";

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

}
