/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakEvDurum;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvDurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvDurumService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class TutanakEvDurumServiceImpl implements TutanakEvDurumService{
     @Autowired
    private TutanakEvDurumRepository repository;

    @Override
    public List<TutanakEvDurum> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<TutanakEvDurum> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public TutanakEvDurum save(TutanakEvDurum tutanakEvDurum) {
        return repository.save(tutanakEvDurum);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
