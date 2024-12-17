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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name = "ENGELLI_TIP")
@NoArgsConstructor
@AllArgsConstructor
public class EngelliTip {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "engelli_tip_seq")
    @SequenceGenerator(name = "engelli_tip_seq", sequenceName = "GEBZEADMIN.ISEQ$$_87904", allocationSize = 1)
    @Column(name = "TIP_ID")
    private Long tipId;

    @Column(name = "TIP_ISIM")
    private String tipIsim;

    @Column(name = "KAYIT_TARIHI")
    private java.sql.Timestamp kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private java.sql.Timestamp guncellemeTarihi;
}
