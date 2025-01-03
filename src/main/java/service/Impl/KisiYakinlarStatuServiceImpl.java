/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.KisiYakinlarStatu;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiYakinlarStatuRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiYakinlarStatuService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class KisiYakinlarStatuServiceImpl implements KisiYakinlarStatuService {
      @Autowired
    private KisiYakinlarStatuRepository kisiYakinlarStatuRepository;

    @Override
    public List<KisiYakinlarStatu> getAllKisiYakinlarStatu() {
        return kisiYakinlarStatuRepository.findAll();
    }

    @Override
    public Optional<KisiYakinlarStatu> getKisiYakinlarStatuById(Integer id) {
        return kisiYakinlarStatuRepository.findById(id);
    }

    @Override
    public KisiYakinlarStatu createKisiYakinlarStatu(KisiYakinlarStatu kisiYakinlarStatu) {
        return kisiYakinlarStatuRepository.save(kisiYakinlarStatu);
    }

    @Override
    public KisiYakinlarStatu updateKisiYakinlarStatu(Integer id, KisiYakinlarStatu kisiYakinlarStatu) {
        kisiYakinlarStatu.setOzelStatuId(id);
        return kisiYakinlarStatuRepository.save(kisiYakinlarStatu);
    }

    @Override
    public void deleteKisiYakinlarStatu(Integer id) {
        kisiYakinlarStatuRepository.deleteById(id);
    }  
}
