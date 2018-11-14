package be.ucll.da.paniek.travak.db;

import be.ucll.da.paniek.travak.model.Sandwich;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SandwichRepository extends CrudRepository<Sandwich, Long> {

    List<Sandwich> findByName(String name);

}
