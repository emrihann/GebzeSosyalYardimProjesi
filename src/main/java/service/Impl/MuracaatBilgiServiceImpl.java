/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.MuracaatBilgi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatBilgiRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatBilgiService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author emirh
 */
@Service
public class MuracaatBilgiServiceImpl implements MuracaatBilgiService {
       private final MuracaatBilgiRepository muracaatBilgiRepository;

    @Autowired
    public MuracaatBilgiServiceImpl(MuracaatBilgiRepository muracaatBilgiRepository) {
        this.muracaatBilgiRepository = muracaatBilgiRepository;
    }

    @Override
    public MuracaatBilgi saveMuracaatBilgi(MuracaatBilgi muracaatBilgi) {
        return muracaatBilgiRepository.save(muracaatBilgi);
    }

    @Override
    public Optional<MuracaatBilgi> getMuracaatBilgiById(Long id) {
        return muracaatBilgiRepository.findById(id);
    }

    @Override
    public List<MuracaatBilgi> getAllMuracaatBilgi() {
        return muracaatBilgiRepository.findAll();
    }

    @Override
    public void deleteMuracaatBilgi(Long id) {
        muracaatBilgiRepository.deleteById(id);
    }
}
