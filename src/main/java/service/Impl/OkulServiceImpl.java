/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Okul;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.OkulRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.OkulService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class OkulServiceImpl implements OkulService {
  private final OkulRepository okulRepository;

    @Autowired
    public OkulServiceImpl(OkulRepository okulRepository) {
        this.okulRepository = okulRepository;
    }

    @Override
    public Okul saveOkul(Okul okul) {
        return okulRepository.save(okul);
    }

    @Override
    public Okul getOkulById(Long id) {
        return okulRepository.findById(id).orElse(null);
    }

    @Override
    public List<Okul> getAllOkullar() {
        return okulRepository.findAll();
    }

    @Override
    public void deleteOkul(Long id) {
        okulRepository.deleteById(id);
    }  
}

