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
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
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
@Table(name="MURACAAT_BILGI")
@NoArgsConstructor
@AllArgsConstructor
public class MuracaatBilgi {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MURACAAT_BILGI_SEQ")
    @SequenceGenerator(name = "MURACAAT_BILGI_SEQ", sequenceName = "GEBZEADMIN.ISEQ$$_88411", allocationSize = 1)
    @Column(name = "MURACAAT_BILGI_ID")
    private Long muracaatBilgiId;

    @Column(name = "ARSIV_DOSYA_NO", nullable = true)
    private Long arsivDosyaNo;

    @Lob
    @Column(name = "ACIKLAMA", nullable = true)
    private String aciklama;

    @Column(name = "MURACAAT_TARIHI", nullable = true)
    private Timestamp muracaatTarihi;

    @Column(name = "KAYIT_TARIHI", nullable = true)
    private Timestamp kayitTarihi;

    @Column(name = "AKTIF", nullable = true)
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI", nullable = true)
    private Timestamp guncellemeTarihi;
}
