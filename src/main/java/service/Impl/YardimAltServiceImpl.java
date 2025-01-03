/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.YardimAlt;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimAltRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimAltService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class YardimAltServiceImpl implements YardimAltService {
     @Autowired
    private YardimAltRepository yardimAltRepository;

    @Override
    public YardimAlt saveYardimAlt(YardimAlt yardimAlt) {
        return yardimAltRepository.save(yardimAlt);
    }

    @Override
    public Optional<YardimAlt> getYardimAltById(int id) {
        return yardimAltRepository.findById(id);
    }

    @Override
    public List<YardimAlt> getAllYardimAltlar() {
        return yardimAltRepository.findAll();
    }

    @Override
    public YardimAlt updateYardimAlt(YardimAlt yardimAlt) {
        return yardimAltRepository.save(yardimAlt);
    }

    @Override
    public void deleteYardimAlt(int id) {
        yardimAltRepository.deleteById(id);
    }
}

