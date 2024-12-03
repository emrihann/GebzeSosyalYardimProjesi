/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.DTO;

import java.util.Date;
import lombok.Data;
/**
 *
 * @author emirh
 */
@Data
public class KisiDetayDto {
    
    private Integer detayId;
    private Integer kisiIletisimId;
    private Integer kisiAdresId;
    private Integer kisiEgitimId;
    private Integer kisiEngelId;
    private Integer meslekId;
    private Date guncellemeTarihi;
    private Integer askerlikId;
}
