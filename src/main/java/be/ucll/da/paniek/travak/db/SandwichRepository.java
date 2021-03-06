package be.ucll.da.paniek.travak.db;

import be.ucll.da.paniek.travak.model.Sandwich;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SandwichRepository extends CrudRepository<Sandwich, UUID> {

    List<Sandwich> findByName(String name);

}
