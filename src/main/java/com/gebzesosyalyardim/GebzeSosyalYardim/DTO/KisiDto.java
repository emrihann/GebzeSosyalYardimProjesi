/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.DTO;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Data
public class KisiDto {
     private Integer kisiId;
    private BigDecimal kimlikNo;
    private String isim;
    private String soyisim;
    private String cinsiyet;
    private Integer ciltNo;
    private Integer aileSiraNo;
    private Integer siraNo;
    private Date dogumTarihi;
    private Integer medeniDurumId;
    private Integer mahalleId;
    private Integer sokakId;
    private String site;
    private String adresTarifi;
    private Integer kapiNo;
    private Integer daireNo;
    private String evTelefon;
    private String cepTelefon;
    private String eposta;
    private Date kayitTarihi;
    private Integer aktif;
}
