/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Yakinlik;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YakinlikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YakinlikService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class YakinlikServiceImpl implements YakinlikService {
     @Autowired
    private YakinlikRepository yakinlikRepository;

    @Override
    public Yakinlik saveYakinlik(Yakinlik yakinlik) {
        return yakinlikRepository.save(yakinlik);
    }

    @Override
    public Optional<Yakinlik> getYakinlikById(int id) {
        return yakinlikRepository.findById(id);
    }

    @Override
    public List<Yakinlik> getAllYakinliklar() {
        return yakinlikRepository.findAll();
    }

    @Override
    public Yakinlik updateYakinlik(Yakinlik yakinlik) {
        return yakinlikRepository.save(yakinlik);
    }

    @Override
    public void deleteYakinlik(int id) {
        yakinlikRepository.deleteById(id);
    }
}
