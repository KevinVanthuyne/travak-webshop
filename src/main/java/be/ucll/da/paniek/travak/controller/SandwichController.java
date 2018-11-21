package be.ucll.da.paniek.travak.controller;

import be.ucll.da.paniek.travak.db.SandwichRepository;
import be.ucll.da.paniek.travak.model.Sandwich;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/sandwiches")
public class SandwichController {

    private SandwichRepository repo;

    public SandwichController(SandwichRepository repo) {
        this.repo = repo;
        // add some dummy data

        repo.save(new Sandwich("Smos kaas & hesp", "Sla, tomatte, kaas, hesp, mayo", new BigDecimal("2.30")));
        repo.save(new Sandwich("Broodje americain", "Uitjes, americain", new BigDecimal("2.60")));
        repo.save(new Sandwich("Kip hawaii", "Kippenblokjes, ananas, tuinkers, cocktailsaus", new BigDecimal("3.00")));
    }

    @GetMapping
    public Iterable<Sandwich> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sandwich> getOne(@PathVariable UUID id) {
        return repo.findById(id);
    }

    @PostMapping
    public Sandwich addSandwich(@RequestBody Sandwich sandwich) {
        return repo.save(sandwich);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateSandwich(@PathVariable UUID id, @RequestBody Sandwich sandwich) {
        if (id.equals(sandwich.getId())) {
            Optional<Sandwich> original = repo.findById(id);
            if (original.isPresent()) {
                sandwich.setId(id);
                repo.save(sandwich);
                return ResponseEntity.status(HttpStatus.OK).body(repo.findById(id).get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}