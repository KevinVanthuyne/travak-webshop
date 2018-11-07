package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Order {

    private UUID id;
    private String mobileNr;
    private LocalDateTime timestamp;
    private String breadType;
    private UUID sandwichId;

    public Order(UUID id, String mobileNr, LocalDateTime timestamp, String breadType, UUID sandwichId) {
        setId(id);
        setMobileNr(mobileNr);
        setTimestamp(timestamp);
        setBreadType(breadType);
        setSandwichId(sandwichId);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMobileNr() {
        return mobileNr;
    }

    public void setMobileNr(String mobileNr) {
        this.mobileNr = mobileNr;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public UUID getSandwichId() {
        return sandwichId;
    }

    public void setSandwichId(UUID sandwichId) {
        this.sandwichId = sandwichId;
    }
}
