package be.ucll.da.paniek.travak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private BigDecimal price;
    private String ingredients;

    public Sandwich() {
    }

    public Sandwich(String name, BigDecimal price, String ingredients) {
        setName(name);
        setPrice(price);
        setIngredients(ingredients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
