/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiEngel;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiEngelRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiEngelService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiEngelServiceImpl implements KisiEngelService {
     private final KisiEngelRepository kisiEngelRepository;

    @Autowired
    public KisiEngelServiceImpl(KisiEngelRepository kisiEngelRepository) {
        this.kisiEngelRepository = kisiEngelRepository;
    }

    @Override
    public List<KisiEngel> getAllKisiEngel() {
        return kisiEngelRepository.findAll();
    }

    @Override
    public Optional<KisiEngel> getKisiEngelById(Long id) {
        return kisiEngelRepository.findById(id);
    }

    @Override
    public KisiEngel saveKisiEngel(KisiEngel kisiEngel) {
        return kisiEngelRepository.save(kisiEngel);
    }

    @Override
    public KisiEngel updateKisiEngel(Long id, KisiEngel kisiEngel) {
        if (kisiEngelRepository.existsById(id)) {
            kisiEngel.setKisiEngelId(id);
            return kisiEngelRepository.save(kisiEngel);
        }
        return null; // ID bulunmazsa null döndürülür.
    }

    @Override
    public void deleteKisiEngel(Long id) {
        kisiEngelRepository.deleteById(id);
    }
}
