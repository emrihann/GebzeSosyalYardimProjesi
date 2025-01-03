/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakGelir;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakGelirRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakGelirService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakGelirServiceImpl implements TutanakGelirService {
      @Autowired
      
    private TutanakGelirRepository tutanakGelirRepository;

    @Override
    public List<TutanakGelir> findAll() {
        return tutanakGelirRepository.findAll();
    }

    @Override
    public Optional<TutanakGelir> findById(Long id) {
        return tutanakGelirRepository.findById(id);
    }

    @Override
    public TutanakGelir save(TutanakGelir tutanakGelir) {
        return tutanakGelirRepository.save(tutanakGelir);
    }

    @Override
    public void deleteById(Long id) {
        tutanakGelirRepository.deleteById(id);
    }
}
