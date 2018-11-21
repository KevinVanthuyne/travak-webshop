package be.ucll.da.paniek.travak.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class SandwichOrder {

    private UUID id;
    private UUID sandwichId;
    private String name;
    private BreadType breadType;
    private LocalDate creationDate;
    private BigDecimal price;
    private String mobilePhoneNumber;

    public SandwichOrder(UUID sandwichId, String name, BreadType breadType, LocalDate creationDate, BigDecimal price, String mobilePhoneNumber) {
        setSandwichId(sandwichId);
        setName(name);
        setBreadType(breadType);
        setCreationDate(creationDate);
        setPrice(price);
        setMobilePhoneNumber(mobilePhoneNumber);
    }

    public SandwichOrder() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSandwichId() {
        return sandwichId;
    }

    public void setSandwichId(UUID sandwichId) {
        this.sandwichId = sandwichId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
