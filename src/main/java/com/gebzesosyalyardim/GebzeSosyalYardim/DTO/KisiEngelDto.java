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
public class KisiEngelDto {


    private Integer engelli_tip_id;

    private Integer engelli_alt_tip_id;

    private Integer kurum_id;

    private Integer alt_kurum_id;

    private float derece = 0;

   
    private String engel_baslangic = "";

   
    private Date kayit_tarihi;

   
    private Integer aktif = 0;

    
    private String hastalik = "";

    private Date guncelleme_tarihi;

    public String getSomeField() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
