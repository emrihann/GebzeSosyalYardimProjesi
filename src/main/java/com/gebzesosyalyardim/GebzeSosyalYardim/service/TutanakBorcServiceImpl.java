/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.TutanakBorc;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakBorcRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author emirh
 */
@Service
public class TutanakBorcServiceImpl implements TutanakBorcService {
    private final TutanakBorcRepository tutanakBorcRepository;

    @Autowired
    public TutanakBorcServiceImpl(TutanakBorcRepository tutanakBorcRepository) {
        this.tutanakBorcRepository = tutanakBorcRepository;
    }

    @Override
    public TutanakBorc saveBorc(TutanakBorc tutanakBorc) {
        return tutanakBorcRepository.save(tutanakBorc);
    }

    @Override
    public List<TutanakBorc> getAllBorcs() {
        return tutanakBorcRepository.findAll();
    }

    @Override
    public Optional<TutanakBorc> getBorcById(Long id) {
        return tutanakBorcRepository.findById(id);
    }

    @Override
    public TutanakBorc updateBorc(Long id, TutanakBorc updatedBorc) {
        return tutanakBorcRepository.findById(id)
                .map(existingBorc -> {
                    existingBorc.setElektrik(updatedBorc.getElektrik());
                    existingBorc.setSu(updatedBorc.getSu());
                    existingBorc.setDogalgaz(updatedBorc.getDogalgaz());
                    existingBorc.setKira(updatedBorc.getKira());
                    existingBorc.setKrediKarti(updatedBorc.getKrediKarti());
                    existingBorc.setDiger(updatedBorc.getDiger());
                    existingBorc.setDigerAciklama(updatedBorc.getDigerAciklama());
                    existingBorc.setGuncellemeTarihi(updatedBorc.getGuncellemeTarihi());
                    return tutanakBorcRepository.save(existingBorc);
                }).orElseThrow(() -> new RuntimeException("Borc not found with id: " + id));
    }

    @Override
    public void deleteBorc(Long id) {
        tutanakBorcRepository.deleteById(id);
    }
}
