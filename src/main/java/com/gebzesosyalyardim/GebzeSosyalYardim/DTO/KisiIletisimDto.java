/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigInteger;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Data
public class KisiIletisimDto {
     private Integer kisi_iletisim_id;

   
    private BigInteger ev_telefon;

    private BigInteger cep_telefon;

    private String eposta;

    private Date kayit_tarihi;

    private Integer aktif;

    private Date guncelleme_tarihi;
}

