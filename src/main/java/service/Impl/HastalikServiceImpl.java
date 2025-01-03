/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Hastalik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.HastalikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.HastalikService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class HastalikServiceImpl implements HastalikService {
     private final HastalikRepository hastalikRepository ;

    @Autowired
    public HastalikServiceImpl(HastalikRepository hastalikRepository) {
        this.hastalikRepository = hastalikRepository;
    }

    @Override
    public List<Hastalik> getAllHastalik() {
        return hastalikRepository.findAll();
    }

    @Override
    public Optional<Hastalik> getHastalikById(Long id) {
        return hastalikRepository.findById(id);
    }

    @Override
    public Hastalik saveHastalik(Hastalik hastalik) {
        return hastalikRepository.save(hastalik);
    }

    @Override
    public Hastalik updateHastalik(Long id, Hastalik hastalik) {
        if (hastalikRepository.existsById(id)) {
            hastalik.setHastalikId(id);
            return hastalikRepository.save(hastalik);
        }
        return null; // Id bulunmazsa null döndürülür
    }

    @Override
    public void deleteHastalik(Long id) {
        hastalikRepository.deleteById(id);
    }
}
