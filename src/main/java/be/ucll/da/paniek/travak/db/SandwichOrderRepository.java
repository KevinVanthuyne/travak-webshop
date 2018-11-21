package be.ucll.da.paniek.travak.db;

import be.ucll.da.paniek.travak.model.SandwichOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface SandwichOrderRepository extends CrudRepository<SandwichOrder, UUID> {
    List<SandwichOrder> findByCreationDate(LocalDate date);
}
