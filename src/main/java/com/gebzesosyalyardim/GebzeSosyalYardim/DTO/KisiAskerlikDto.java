/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.DTO;


import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author emirh
 */
@Data
public class KisiAskerlikDto {
     private Integer askerlikId;
    private Integer askerHukumlu;
    private Integer sure;
    private String aciklama;
    private LocalDate baslangicTarihi;
    private LocalDate bitisTarihi;
    private Boolean aktif = true;
    private LocalDateTime kayitTarihi = LocalDateTime.now();
    private LocalDateTime guncellemeTarihi;
    
}
