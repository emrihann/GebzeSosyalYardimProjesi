/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiHastalik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiHastalikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiHastalikService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiHastalikServiceImpl implements KisiHastalikService {
    private final KisiHastalikRepository kisiHastalikRepository;

    @Autowired
    public KisiHastalikServiceImpl(KisiHastalikRepository kisiHastalikRepository) {
        this.kisiHastalikRepository = kisiHastalikRepository;
    }

    @Override
    public List<KisiHastalik> getAllKisiHastalik() {
        return kisiHastalikRepository.findAll();
    }

    @Override
    public Optional<KisiHastalik> getKisiHastalikById(Long id) {
        return kisiHastalikRepository.findById(id);
    }

    @Override
    public KisiHastalik saveKisiHastalik(KisiHastalik kisiHastalik) {
        return kisiHastalikRepository.save(kisiHastalik);
    }

    @Override
    public KisiHastalik updateKisiHastalik(Long id, KisiHastalik kisiHastalik) {
        if (kisiHastalikRepository.existsById(id)) {
            kisiHastalik.setKisiHastalikId(id);
            return kisiHastalikRepository.save(kisiHastalik);
        }
        return null; // ID bulunmazsa null döndürülür.
    }

    @Override
    public void deleteKisiHastalik(Long id) {
        kisiHastalikRepository.deleteById(id);
    } 
}
