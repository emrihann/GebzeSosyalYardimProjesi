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
@Table(name = "GUVENCE_BIRIM")
@NoArgsConstructor
@AllArgsConstructor
public class GuvenceBirim {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guvence_birim_seq")
    @SequenceGenerator(name = "guvence_birim_seq", sequenceName = "GEBZEADMIN.ISEQ$$_87912", allocationSize = 1)
    @Column(name = "BIRIM_ID")
    private Long birimId;

    @Column(name = "BIRIM_ISIM")
    private String birimIsim;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
}
