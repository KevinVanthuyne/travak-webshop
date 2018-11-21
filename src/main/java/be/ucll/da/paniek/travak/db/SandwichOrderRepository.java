package be.ucll.da.paniek.travak.db;

import be.ucll.da.paniek.travak.model.SandwichOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SandwichOrderRepository extends CrudRepository<SandwichOrder, UUID> {

}
