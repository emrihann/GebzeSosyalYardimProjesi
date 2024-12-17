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
@Table(name="MURACAAT_YARDIM_TALEP")
@NoArgsConstructor
@AllArgsConstructor
public class MuracaatYardimTalep {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TALEP_ID")
    private Integer talepId;

    @Column(name = "MURACAAT_ID")
    private Integer muracaatId;

    @Column(name = "YARDIM_TIP")
    private Integer yardimTip;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;
}
