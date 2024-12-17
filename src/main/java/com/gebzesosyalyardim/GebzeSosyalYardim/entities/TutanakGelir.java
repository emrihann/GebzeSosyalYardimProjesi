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


@Entity
@Data
@Table(name = "TUTANAK_GELIR")
@NoArgsConstructor
@AllArgsConstructor
public class TutanakGelir {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gelir_seq")
    @SequenceGenerator(name = "gelir_seq", sequenceName = "GEBZEADMIN.ISEQ$$_88443", allocationSize = 1)
    private Long gelirId;

    @Column(name = "YASLILIK", nullable = false)
    private Double yaslilik = 0.0;

    @Column(name = "ENGELLI", nullable = false)
    private Double engelli = 0.0;

    @Column(name = "ENGELLI_YAKINI", nullable = false)
    private Double engelliYakini = 0.0;

    @Column(name = "YETIM_AYLIGI", nullable = false)
    private Double yetimAyligi = 0.0;

    @Column(name = "EMEKLI_MAASI", nullable = false)
    private Double emekliMaasi = 0.0;

    @Column(name = "EVDE_BAKIM_PARASI", nullable = false)
    private Double evdeBakimParasi = 0.0;

    @Column(name = "DUL_MAASI", nullable = false)
    private Double dulMaasi = 0.0;

    @Column(name = "ISSIZLIK_MAASI", nullable = false)
    private Double issizlikMaasi = 0.0;

    @Column(name = "ASKER_MAASI", nullable = false)
    private Double askerMaasi = 0.0;

    @Column(name = "KIRA_MAASI", nullable = false)
    private Double kiraMaasi = 0.0;

    @Column(name = "KAYMAKAMLIK", nullable = false)
    private Double kaymakamlik = 0.0;

    @Column(name = "SOSYAL_HIZMETLER", nullable = false)
    private Double sosyalHizmetler = 0.0;

    @Column(name = "BUYUKSEHIR", nullable = false)
    private Double buyuksehir = 0.0;

    @Column(name = "OZEL_VAKIF", nullable = false)
    private Double ozelVakif = 0.0;

    @Column(name = "DIGER", nullable = false)
    private Double diger = 0.0;

    @Column(name = "AKTIF", nullable = false)
    private Integer aktif = 1;

    @Column(name = "KAYIT_TARIHI", nullable = false)
    private ZonedDateTime kayitTarihi;

    @Column(name = "GUNCELLEME_TARIHI")
    private ZonedDateTime guncellemeTarihi;

    @Column(name = "DIGER_ACIKLAMA", length = 1000)
    private String digerAciklama;
}
