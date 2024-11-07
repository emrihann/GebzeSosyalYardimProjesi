import com.gebzesosyalyardim.GebzeSosyalYardim.entities.Kisi;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kisiler")
public class KisiController {

    @Autowired
    private KisiService kisiService;

    @GetMapping
    public ResponseEntity<List<Kisi>> getAllKisi() {
        List<Kisi> kisiler = kisiService.getAllKisi();
        return new ResponseEntity<>(kisiler, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kisi> getKisiById(@PathVariable Integer id) {
        Optional<Kisi> kisi = kisiService.getKisiById(id);
        return kisi.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Kisi> createKisi(@RequestBody Kisi kisi) {
        try {
            Kisi newKisi = kisiService.createKisi(kisi);
            return new ResponseEntity<>(newKisi, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kisi> updateKisi(@PathVariable Integer id, @RequestBody Kisi kisi) {
        try {
            Kisi updatedKisi = kisiService.updateKisi(id, kisi);
            return new ResponseEntity<>(updatedKisi, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKisi(@PathVariable Integer id) {
        try {
            kisiService.deleteKisi(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
