package be.ucll.da.paniek.travak.controller;

import be.ucll.da.paniek.travak.db.SandwichOrderRepository;
import be.ucll.da.paniek.travak.model.SandwichOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class SandwichOrderController {

    private SandwichOrderRepository repo;

    public SandwichOrderController(@Autowired SandwichOrderRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public SandwichOrder addSandwichOrder(@RequestBody SandwichOrder sandwichOrder) {
        return repo.save(sandwichOrder);
    }

    @GetMapping
    public Iterable<SandwichOrder> getAll() {
        return repo.findAll();
    }
}
