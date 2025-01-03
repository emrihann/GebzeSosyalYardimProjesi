/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakBorcRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakBorcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutanakBorcServiceImpl implements TutanakBorcService {

    @Autowired
    private TutanakBorcRepository tutanakBorcRepository;

    @Override
    public List<TutanakBorc> findAll() {
        return tutanakBorcRepository.findAll();
    }

    @Override
    public Optional<TutanakBorc> findById(Long id) {
        return tutanakBorcRepository.findById(id);
    }

    @Override
    public TutanakBorc save(TutanakBorc tutanakBorc) {
        return tutanakBorcRepository.save(tutanakBorc);
    }

    @Override
    public void deleteById(Long id) {
        tutanakBorcRepository.deleteById(id);
    }
}
