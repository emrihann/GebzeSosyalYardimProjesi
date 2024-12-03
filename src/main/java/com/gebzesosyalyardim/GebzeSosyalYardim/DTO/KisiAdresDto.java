/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Data
public class KisiAdresDto {
    private Integer kisi_adres_id;
    private String tarif;
    private String site;
    private Integer kapi_no;
    private Integer daire_no;
    private Integer kisi_adres_mahalle_id;
    private String kisi_adres_mahalle_isim;
    private Integer kisi_mahalle_sokak_id;
    private String kisi_mahalle_sokak_isim;
    private Date kayit_tarihi;
    private Integer aktif = 1;
}
