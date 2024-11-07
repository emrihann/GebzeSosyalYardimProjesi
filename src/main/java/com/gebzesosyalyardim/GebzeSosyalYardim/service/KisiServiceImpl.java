import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KisiServiceImpl implements KisiService {

    @Autowired
    private KisiRepository kisiRepository;

    @Override
    public List<Kisi> getAllKisi() {
        return kisiRepository.findAll();
    }

    @Override
    public Optional<Kisi> getKisiById(Integer id) {
        return kisiRepository.findById(id);
    }

    @Override
    public Kisi createKisi(Kisi kisi) {
        return kisiRepository.save(kisi);
    }

    @Override
    public Kisi updateKisi(Integer id, Kisi kisi) {
        if (!kisiRepository.existsById(id)) {
            throw new IllegalArgumentException("Belirtilen ID ile kisi bulunamadı.");
        }
        kisi.setKisi_id(id);
        return kisiRepository.save(kisi);
    }

    @Override
    public void deleteKisi(Integer id) {
        if (!kisiRepository.existsById(id)) {
            throw new IllegalArgumentException("Belirtilen ID ile kisi bulunamadı.");
        }
        kisiRepository.deleteById(id);
    }
}
