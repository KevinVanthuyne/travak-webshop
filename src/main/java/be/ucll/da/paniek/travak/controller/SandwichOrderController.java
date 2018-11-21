package be.ucll.da.paniek.travak.controller;

import be.ucll.da.paniek.travak.db.SandwichOrderRepository;
import be.ucll.da.paniek.travak.model.BreadType;
import be.ucll.da.paniek.travak.model.SandwichOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class SandwichOrderController {

    private SandwichOrderRepository repo;

    public SandwichOrderController(@Autowired SandwichOrderRepository repo) {
        this.repo = repo;

        // add dummy data
        repo.save(new SandwichOrder(UUID.randomUUID(), "Smoske hesp", BreadType.WIT, LocalDateTime.now(), new BigDecimal(3.5), "0496/112233"));
        repo.save(new SandwichOrder(UUID.randomUUID(), "Smoske boulet", BreadType.BRUIN, LocalDateTime.now(), new BigDecimal(2.95), "0496/006600"));
    }

    @PostMapping
    public SandwichOrder addSandwichOrder(@RequestBody SandwichOrder sandwichOrder) {
        // TODO returns creationDate as null
        return repo.save(sandwichOrder);
    }

    @GetMapping
    // TODO
    public Iterable<SandwichOrder> getOrdersOfDate(@RequestParam(required = false) LocalDate date) {
        if (date == null) {
            return repo.findAll();
        }
        return repo.findByCreationDate(date);
    }
}
