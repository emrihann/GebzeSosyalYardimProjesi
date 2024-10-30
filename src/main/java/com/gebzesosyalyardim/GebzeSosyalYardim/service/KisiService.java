/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service

public class KisiService {
    private final KisiRepository kisiRepository;

    @Autowired
    public KisiService(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }

    public List<Kisi> getAllKisi() {
        return kisiRepository.findAll();
    }

    public Kisi getKisiById(Integer id) {
        Optional<Kisi> kisi = kisiRepository.findById(id);
        return kisi.orElse(null); // ID'ye göre kayıt bulunamazsa null döndür
    }

    public Kisi createKisi(Kisi kisi) {
        return kisiRepository.save(kisi);
    }

    public Kisi updateKisi(Integer id, Kisi kisiDetails) {
        return kisiRepository.findById(id).map(kisi -> {
            kisi.setKimlik_no(kisiDetails.getKimlik_no());
            kisi.setIsim(kisiDetails.getIsim());
            kisi.setSoyisim(kisiDetails.getSoyisim());
            kisi.setCinsiyet(kisiDetails.getCinsiyet());
            kisi.setCilt_no(kisiDetails.getCilt_no());
            kisi.setAile_sira_no(kisiDetails.getAile_sira_no());
            kisi.setSira_no(kisiDetails.getSira_no());
            kisi.setDogum_tarihi(kisiDetails.getDogum_tarihi());
            kisi.setMedeni_durum_id(kisiDetails.getMedeni_durum_id());
            kisi.setMahalle_id(kisiDetails.getMahalle_id());
            kisi.setSokak_id(kisiDetails.getSokak_id());
            kisi.setSite(kisiDetails.getSite());
            kisi.setAdres_tarifi(kisiDetails.getAdres_tarifi());
            kisi.setKapi_no(kisiDetails.getKapi_no());
            kisi.setDaire_no(kisiDetails.getDaire_no());
            kisi.setEv_telefon(kisiDetails.getEv_telefon());
            kisi.setCep_telefon(kisiDetails.getCep_telefon());
            kisi.setEposta(kisiDetails.getEposta());
            kisi.setKayit_tarihi(kisiDetails.getKayit_tarihi());
            kisi.setAktif(kisiDetails.getAktif());
            return kisiRepository.save(kisi);
        }).orElse(null); // ID'ye göre kayıt bulunamazsa null döndür
    }

    public void deleteKisi(Integer id) {
        kisiRepository.deleteById(id);
    }
    
}
