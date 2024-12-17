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
@Table(name = "GUVENCE")
@NoArgsConstructor
@AllArgsConstructor
public class Guvence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guvence_seq")
    @SequenceGenerator(name = "guvence_seq", sequenceName = "GEBZEADMIN.ISEQ$$_87910", allocationSize = 1)
    @Column(name = "GUVENCE_ID")
    private Long guvenceId;

    @Column(name = "GUVENCE")
    private String guvence;

    @Column(name = "KAYIT_TARIHI")
    private ZonedDateTime kayitTarihi;

    @Column(name = "AKTIF")
    private Integer aktif;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;
}
