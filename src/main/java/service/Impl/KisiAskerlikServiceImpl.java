/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiAskerlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiAskerlikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAskerlikService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiAskerlikServiceImpl implements KisiAskerlikService {
     @Autowired
    private KisiAskerlikRepository kisiAskerlikRepository;

    @Override
    public List<KisiAskerlik> findAll() {
        return kisiAskerlikRepository.findAll();
    }

    @Override
    public Optional<KisiAskerlik> findById(Long id) {
        return kisiAskerlikRepository.findById(id);
    }

    @Override
    public KisiAskerlik save(KisiAskerlik kisiAskerlik) {
        return kisiAskerlikRepository.save(kisiAskerlik);
    }

    @Override
    public void deleteById(Long id) {
        kisiAskerlikRepository.deleteById(id);
    }
}
