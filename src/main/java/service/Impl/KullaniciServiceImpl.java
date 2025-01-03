/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kullanici;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KullaniciRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KullaniciService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KullaniciServiceImpl implements KullaniciService{
     private final KullaniciRepository kullaniciRepository;

    @Autowired
    public KullaniciServiceImpl(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @Override
    public Kullanici saveKullanici(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public Kullanici getKullaniciById(Long id) {
        return kullaniciRepository.findById(id).orElse(null);
    }

    @Override
    public List<Kullanici> getAllKullanicilar() {
        return kullaniciRepository.findAll();
    }

    @Override
    public void deleteKullanici(Long id) {
        kullaniciRepository.deleteById(id);
    }
}
