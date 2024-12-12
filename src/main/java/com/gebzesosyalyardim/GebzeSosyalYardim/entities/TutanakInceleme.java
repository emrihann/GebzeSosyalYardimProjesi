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
import lombok.Data;

/**
 *
 * @author emirh
 */
@Entity
@Data
@Table(name="TUTANAK_INCELEME")
public class TutanakInceleme {

    public TutanakInceleme() {
    }

    public TutanakInceleme(String tutanak_id, String tutanak_inceleme) {
        this.tutanak_id = tutanak_id;
        this.tutanak_inceleme = tutanak_inceleme;
    }
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="TUTANAK_ID")
  private String tutanak_id;
  @Column(name="TUTANAK_INCELEME",length=255)
  private String tutanak_inceleme;
  
}
