package be.ucll.da.paniek.travak.controller;

import be.ucll.da.paniek.travak.db.SandwichRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandwichController {

    private SandwichRepository repo;

    public SandwichController(SandwichRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/sandwiches")
    public String getAll() {
        return repo.findAll().toString();
    }
}