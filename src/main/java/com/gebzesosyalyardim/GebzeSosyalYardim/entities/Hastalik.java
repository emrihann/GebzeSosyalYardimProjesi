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
@Table(name = "HASTALIK")
@NoArgsConstructor
@AllArgsConstructor
public class Hastalik {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hastalik_seq")
    @SequenceGenerator(name = "hastalik_seq", sequenceName = "GEBZEADMIN.ISEQ$$_87914", allocationSize = 1)
    @Column(name = "HASTALIK_ID")
    private Long hastalikId;

    @Column(name = "HASTALIK")
    private String hastalik;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "KAYIT_TARIHI")
    private ZonedDateTime kayitTarihi;

    @Column(name = "EKLEYEN_KULLANICI_ID")
    private Long ekleyenKullaniciId;
}
