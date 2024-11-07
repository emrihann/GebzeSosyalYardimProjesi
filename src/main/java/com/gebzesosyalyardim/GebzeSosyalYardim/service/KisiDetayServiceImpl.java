package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiDetay;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiDetayRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisiDetayServiceImpl implements KisiDetayService {
    @Autowired
    private KisiDetayRepository kisiDetayRepository;

    @Override
    public List<KisiDetay> getAllKisiDetay() {
        return kisiDetayRepository.findAll();
    }

    @Override
    public Optional<KisiDetay> getKisiDetayById(Integer id) {
        return kisiDetayRepository.findById(id);
    }

    @Override
    public KisiDetay createKisiDetay(KisiDetay kisiDetay) {
        kisiDetay.setGuncellemeTarihi(new Date()); // Yeni kayıt için güncelleme tarihini belirliyoruz
        return kisiDetayRepository.save(kisiDetay);
    }

    @Override
    public KisiDetay updateKisiDetay(Integer id, KisiDetay kisiDetay) {
        if (kisiDetayRepository.existsById(id)) {
            kisiDetay.setDetayId(id);
            kisiDetay.setGuncellemeTarihi(new Date()); // Güncelleme tarihi otomatik olarak ayarlanıyor
            return kisiDetayRepository.save(kisiDetay);
        }
        throw new EntityNotFoundException("KisiDetay not found with ID: " + id); // Kayıt bulunamazsa istisna fırlatılıyor
    }

    @Override
    public void deleteKisiDetay(Integer id) {
        kisiDetayRepository.deleteById(id);
    }
}
