package model;

import java.math.BigDecimal;
import java.util.UUID;

public class Sandwich {

    private String name;
    private BigDecimal price;
    private String ingredients;
    private UUID id;

    public Sandwich(String name, BigDecimal price, String ingredients, UUID id) {
        setName(name);
        setPrice(price);
        setIngredients(ingredients);
        setId(id);
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
