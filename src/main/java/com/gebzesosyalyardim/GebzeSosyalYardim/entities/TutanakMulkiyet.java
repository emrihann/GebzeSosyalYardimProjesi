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
@Table(name="TUTANAK_MULKIYET")
public class TutanakMulkiyet {

    public TutanakMulkiyet() {
    }

    public TutanakMulkiyet(Integer mulkiyetId, Integer mulkiyetSiraNo, Integer evDurumId, Float kiraMiktar, Integer yakacakTipId, Integer kiradaEvSayisi, String arabaModel, String gayrimenkulTur, Integer evTipId, Date guncellemeTarihi, String evDurumIsim, String yakacakTipIsim, String evTipIsim) {
        this.mulkiyetId = mulkiyetId;
        this.mulkiyetSiraNo = mulkiyetSiraNo;
        this.evDurumId = evDurumId;
        this.kiraMiktar = kiraMiktar;
        this.yakacakTipId = yakacakTipId;
        this.kiradaEvSayisi = kiradaEvSayisi;
        this.arabaModel = arabaModel;
        this.gayrimenkulTur = gayrimenkulTur;
        this.evTipId = evTipId;
        this.guncellemeTarihi = guncellemeTarihi;
        this.evDurumIsim = evDurumIsim;
        this.yakacakTipIsim = yakacakTipIsim;
        this.evTipIsim = evTipIsim;
    }
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MULKIYET_ID")
    private Integer mulkiyetId;

    @Column(name = "MULKIYET_SIRA_NO")
    private Integer mulkiyetSiraNo;

    @Column(name = "EV_DURUM_ID")
    private Integer evDurumId;

    @Column(name = "KIRA_MIKTAR")
    private Float kiraMiktar;

    @Column(name = "YAKACAK_TIP_ID")
    private Integer yakacakTipId;

    @Column(name = "KIRADA_EV_VAR_MI", columnDefinition = "int default 0")
    private Integer kiradaEvVarMi = 0;

    @Column(name = "KIRADA_EV_SAYISI")
    private Integer kiradaEvSayisi;

    @Column(name = "ARABA_VAR_MI", columnDefinition = "int default 0")
    private Integer arabaVarMi = 0;

    @Column(name = "ARABA_MODEL", length = 100)
    private String arabaModel;

    @Column(name = "GAYRIMENKUL_VAR_MI", columnDefinition = "int default 0")
    private Integer gayrimenkulVarMi = 0;

    @Column(name = "GAYRIMENKUL_TUR", length = 100)
    private String gayrimenkulTur;

    @Column(name = "EV_TIP_ID")
    private Integer evTipId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "GUNCELLEME_TARIHI")
    private Date guncellemeTarihi;

    @Column(name = "EV_DURUM_ISIM", length = 100)
    private String evDurumIsim;

    @Column(name = "YAKACAK_TIP_ISIM", length = 100)
    private String yakacakTipIsim;

    @Column(name = "EV_TIP_ISIM", length = 100)
    private String evTipIsim;

}
