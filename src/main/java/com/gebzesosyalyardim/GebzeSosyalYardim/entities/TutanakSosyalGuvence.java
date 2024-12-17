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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="TUTANAK_SAGLIK_GUVENCE")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakSosyalGuvence {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOSYAL_GUVENCE_ID")
    private Integer sosyalGuvenceId;

    @Column(name = "GUVENCE_VAR_MI", columnDefinition = "int default 0")
    private Integer guvenceVarMi = 0;

    @Column(name = "GUVENCE_ID")
    private Integer guvenceId;

    @Column(name = "BIRIM_ID")
    private Integer birimId;

    @Column(name = "BIRIM_ACIKLAMA", length = 255)
    private String birimAciklama;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;
}
