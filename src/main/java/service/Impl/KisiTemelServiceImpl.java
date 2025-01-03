/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiTemel;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiTemelRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiTemelService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiTemelServiceImpl implements KisiTemelService {
    @Autowired
    private KisiTemelRepository kisiTemelRepository;

    @Override
    public KisiTemel saveKisiTemel(KisiTemel kisiTemel) {
        try {
            return kisiTemelRepository.save(kisiTemel);
        } catch (Exception e) {
            throw new RuntimeException("Kişi kaydedilirken hata oluştu", e);
        }
    }

    @Override
    public List<KisiTemel> getAllKisiler() {
        return kisiTemelRepository.findAll();
    }

    @Override
    public Optional<KisiTemel> getKisiById(Long id) {
        return kisiTemelRepository.findById(id);
    }

    @Override
    public KisiTemel updateKisiTemel(Long id, KisiTemel kisiTemel) {
        return kisiTemelRepository.findById(id).map(existingKisi -> {
            existingKisi.setKimlikNo(kisiTemel.getKimlikNo());
            existingKisi.setIsim(kisiTemel.getIsim());
            existingKisi.setSoyisim(kisiTemel.getSoyisim());
            existingKisi.setCinsiyet(kisiTemel.getCinsiyet());
            existingKisi.setCiltNo(kisiTemel.getCiltNo());
            existingKisi.setAileSiraNo(kisiTemel.getAileSiraNo());
            existingKisi.setSiraNo(kisiTemel.getSiraNo());
            existingKisi.setDogumTarihi(kisiTemel.getDogumTarihi());
            existingKisi.setMedeniDurumId(kisiTemel.getMedeniDurumId());
            existingKisi.setAktif(kisiTemel.getAktif());
            existingKisi.setGuncellemeTarihi(kisiTemel.getGuncellemeTarihi());
            existingKisi.setKisiDetayId(kisiTemel.getKisiDetayId());
            return kisiTemelRepository.save(existingKisi);
        }).orElseThrow(() -> new RuntimeException("Kişi bulunamadı: " + id));
    }

    @Override
    public void deleteKisiById(Long id) {
        if (!kisiTemelRepository.existsById(id)) {
            throw new RuntimeException("Kişi bulunamadı: " + id);
        }
        kisiTemelRepository.deleteById(id);
    }
}
